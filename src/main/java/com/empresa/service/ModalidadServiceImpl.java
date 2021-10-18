package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.FiltroModalidad;
import com.empresa.entity.Modalidad;
import com.empresa.repository.ModalidadRepository;

@Service
public class ModalidadServiceImpl implements ModalidadService {

	@Autowired
	private ModalidadRepository repositorio;

	@Override
	public Modalidad insertaActualizaModalidad(Modalidad obj) {
		return repositorio.save(obj);
	}

	@Override
	public List<Modalidad> listaModalidad() {
		return repositorio.findAll();
	}

	@Override
	public List<Modalidad> listaModalidadSedePorDeporte(String sede, String nombre, int idDeporte) {
	
		return repositorio.listaModalidadSedePorDeporte(sede, nombre, idDeporte);

}

	@Override
	public List<Modalidad> listaPorFiltroModalidad(FiltroModalidad fitro) {
		// TODO Auto-generated method stub
		return repositorio.listaPorFiltroModalidad(fitro);
	}
}