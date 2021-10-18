package com.empresa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.empresa.entity.Docente;
import com.empresa.entity.FiltroDocente;
import com.empresa.entity.FiltroModalidad;
import com.empresa.entity.Modalidad;

public interface ModalidadRepository extends JpaRepository<Modalidad, Integer>  {

	@Query("select d from Modalidad d where "
			+ "( :p_sede is '' or d.sede = :p_sede ) and "
			+ "( :p_nom is '' or d.nombre like :p_nom ) and "
			+ "( :p_depo is 0  or d.deporte.idDeporte = :p_depo ) ")
	public abstract List<Modalidad> listaModalidadSedePorDeporte(
								 	@Param("p_sede") String sede, 
								 	@Param("p_nom") String nombre,
								 	@Param("p_depo") int idDeporte);
	
	@Query("select d from Modalidad d where "
			+ "( :#{#fil.sede} is '' or d.sede = :#{#fil.sede} ) and "
			+ "( :#{#fil.nombre} is '' or d.nombre like :#{#fil.nombre} ) and "
			+ "( :#{#fil.idDeporte} is 0  or d.deporte.idDeporte = :#{#fil.idDeporte} ) ")
	public abstract List<Modalidad> listaPorFiltroModalidad(@Param("fil")FiltroModalidad filtro);
	
}
