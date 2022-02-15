package com.microservicio.persona;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroservicioPersonaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioPersonaApplication.class, args);
	}

}
