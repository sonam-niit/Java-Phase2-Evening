package com.simplilearn.apachekafka;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;


@Configuration
public class ApacheConsumerConfig {

	@Bean
	public ConsumerFactory<String, String> consumerFactory(){
		Map<String, Object> configProp= new HashMap<String, Object>();
		configProp.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9091");
		configProp.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		configProp.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		configProp.put(ConsumerConfig.GROUP_ID_CONFIG, "group-id");
		
		ConsumerFactory<String, String> factory= 
				new DefaultKafkaConsumerFactory<String, String>(configProp);
		return factory;
	}
	@Bean
	public ConcurrentKafkaListenerContainerFactory<String, String> kafkaListener(){
		ConcurrentKafkaListenerContainerFactory<String, String> factory=
				new ConcurrentKafkaListenerContainerFactory<String, String>();
		return factory;
	}
}
