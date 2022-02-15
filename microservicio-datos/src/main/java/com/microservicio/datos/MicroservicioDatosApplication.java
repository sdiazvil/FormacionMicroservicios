package com.microservicio.datos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MicroservicioDatosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioDatosApplication.class, args);
	}

}
