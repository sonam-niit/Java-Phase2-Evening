package com.simplilearn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.simplilearn.custom.CustomEventPublisher;

@Controller
public class MainController {

	@Autowired
	ConfigurableApplicationContext appContext;
	@Autowired
	CustomEventPublisher cep;
	
	@GetMapping("/default")
	public String handleEvent() {
		appContext.start();
		appContext.stop();
		return "default";
	}
	
	@GetMapping("/custom")
	public String customHandleEvent() {
		cep.publish();
		return "custom";
	}
	
}
