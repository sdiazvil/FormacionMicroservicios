package com.microservicio.datos.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservicio.datos.feign.PersonasFeignClient;
import com.microservicio.datos.model.DatosPersonasRest;
import com.microservicio.datos.service.DatosService;

@Service
public class DatosServiceImpl implements DatosService{
	
	@Autowired
	private PersonasFeignClient personasFeignClient;

	@Override
	public List<DatosPersonasRest> getListadoPersonas() {
		
		List<DatosPersonasRest> listDatosPersonasRest = personasFeignClient.getPersonas();
		
		return listDatosPersonasRest;
	}
	
	
}
