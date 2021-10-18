package com.empresa.service;

import java.util.List;

import com.empresa.entity.FiltroModalidad;
import com.empresa.entity.Modalidad;

public interface ModalidadService {

	public Modalidad insertaActualizaModalidad(Modalidad obj);
	public List<Modalidad> listaModalidad();
	
	public  List<Modalidad> listaModalidadSedePorDeporte(String sede, String nombre,int idDeporte);
	public List<Modalidad> listaPorFiltroModalidad(FiltroModalidad fitro);
}
