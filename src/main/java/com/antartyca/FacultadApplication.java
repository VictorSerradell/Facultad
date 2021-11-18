package com.antartyca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.antartyca.repositories")
public class FacultadApplication {

	public static void main(String[] args) {
		SpringApplication.run(FacultadApplication.class, args);
	}

}
