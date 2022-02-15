package com.microservicio.persona.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservicio.persona.entity.PersonaEntity;
import com.microservicio.persona.service.PersonaService;

@RestController
public class PersonaController {
	
	@Autowired
	private PersonaService personaService;
	
	@GetMapping("/personas")
	public List<PersonaEntity> getPersonas(){
		return personaService.getPersonas();
	}
}
