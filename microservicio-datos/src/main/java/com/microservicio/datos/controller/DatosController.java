package com.microservicio.datos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservicio.datos.model.DatosPersonasRest;
import com.microservicio.datos.service.DatosService;

@RestController
public class DatosController {
	
	@Autowired
	private DatosService datosService;
	
	
	@GetMapping("/datos")
	public List<DatosPersonasRest> getDatosPersonas(){
		
		return datosService.getListadoPersonas();
		
	}

}
