package com.microservicio.datos.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.microservicio.datos.model.DatosPersonasRest;

@FeignClient(name="microservicio-persona")
public interface PersonasFeignClient {
	
	@GetMapping("/personas")
	public List<DatosPersonasRest> getPersonas();
	
	
}
