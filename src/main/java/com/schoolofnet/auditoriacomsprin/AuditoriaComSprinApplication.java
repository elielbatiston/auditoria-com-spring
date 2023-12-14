package com.schoolofnet.auditoriacomsprin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class AuditoriaComSprinApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuditoriaComSprinApplication.class, args);
	}

}
