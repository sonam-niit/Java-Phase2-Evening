package com.simplilearn.edge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaServer
@ComponentScan("com.simplilearn.edge")
public class EdgeserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(EdgeserverApplication.class, args);
	}

}
