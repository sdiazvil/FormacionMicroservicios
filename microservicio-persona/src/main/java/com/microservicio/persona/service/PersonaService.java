package com.microservicio.persona.service;

import java.util.List;

import com.microservicio.persona.entity.PersonaEntity;

public interface PersonaService {
	
	public List<PersonaEntity> getPersonas();
}
