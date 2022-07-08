package com.simplilearn.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.simplilearn.rest")
public class ConsumeRestFullServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumeRestFullServicesApplication.class, args);
	}

}
