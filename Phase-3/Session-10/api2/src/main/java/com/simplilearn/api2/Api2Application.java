package com.simplilearn.api2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.simplilearn.api2")
public class Api2Application {

	public static void main(String[] args) {
		SpringApplication.run(Api2Application.class, args);
	}

}
