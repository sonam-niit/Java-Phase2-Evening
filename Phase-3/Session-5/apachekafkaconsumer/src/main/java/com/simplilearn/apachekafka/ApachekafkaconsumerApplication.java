package com.simplilearn.apachekafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
@EnableKafka
public class ApachekafkaconsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApachekafkaconsumerApplication.class, args);
		
		
	}
	@KafkaListener(topics = "GENERAL", groupId = "group-id")
	public void listen(String message) {
		System.out.println("Message Received "+message);
	}

}
