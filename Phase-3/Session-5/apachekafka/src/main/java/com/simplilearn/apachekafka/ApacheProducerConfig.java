package com.simplilearn.apachekafka;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;


@Configuration
public class ApacheProducerConfig {

	@Bean
	public ProducerFactory<String, String> producerFacory() {
		
		Map<String, Object> configProp= new HashMap<String, Object>();
		
		configProp.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		configProp.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		configProp.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		
		ProducerFactory<String, String> factory= 
				new DefaultKafkaProducerFactory<String, String>(configProp);
		return factory;
	}
	@Bean
	public KafkaTemplate<String, String> kafkaTemplate(){
		return new KafkaTemplate<String, String>(producerFacory());
	}
}
