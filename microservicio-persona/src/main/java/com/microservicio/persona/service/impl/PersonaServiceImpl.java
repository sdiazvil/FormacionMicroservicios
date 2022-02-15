package com.microservicio.persona.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.microservicio.persona.entity.PersonaEntity;
import com.microservicio.persona.repository.PersonaRepository;
import com.microservicio.persona.service.PersonaService;

@Service
public class PersonaServiceImpl implements PersonaService{
	
	@Autowired
	private PersonaRepository personaRepository;
	
	@Value("${config.balanceador.test}")
	private String balanceador;

	@Override
	public List<PersonaEntity> getPersonas() {
		List<PersonaEntity> listPersonaEntity = new ArrayList<>();
		
		listPersonaEntity = personaRepository.findAll();
		
		listPersonaEntity.stream().forEach(personaEntity->{
			personaEntity.setBalanceador(balanceador);
		});
		
		return listPersonaEntity;
	}
	
}
