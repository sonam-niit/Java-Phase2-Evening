package com.simplilearn.apachekafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
@ComponentScan("com.simplilearn.apachekafka")
public class ApachekafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApachekafkaApplication.class, args);
	}

}
