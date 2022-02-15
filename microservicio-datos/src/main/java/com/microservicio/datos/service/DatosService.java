package com.microservicio.datos.service;

import java.util.List;

import com.microservicio.datos.model.DatosPersonasRest;

public interface DatosService {
	
	public List<DatosPersonasRest> getListadoPersonas();
	
}
