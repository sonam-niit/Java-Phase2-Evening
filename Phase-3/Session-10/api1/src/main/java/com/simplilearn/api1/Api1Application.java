package com.simplilearn.api1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.simplilearn.api1")
public class Api1Application {

	public static void main(String[] args) {
		SpringApplication.run(Api1Application.class, args);
	}

}
