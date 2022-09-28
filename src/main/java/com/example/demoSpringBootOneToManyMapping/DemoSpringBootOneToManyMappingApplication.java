package com.example.demoSpringBootOneToManyMapping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class DemoSpringBootOneToManyMappingApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringBootOneToManyMappingApplication.class, args);
	}

}
