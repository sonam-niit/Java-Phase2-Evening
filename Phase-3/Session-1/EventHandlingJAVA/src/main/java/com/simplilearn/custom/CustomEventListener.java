package com.simplilearn.custom;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;

public class CustomEventListener implements ApplicationListener<CustomEvent>{

	public void onApplicationEvent(CustomEvent event) {
		System.out.println(event.toString());
		
	}

}
