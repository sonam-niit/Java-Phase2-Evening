package com.simplilearn.api2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.api2.entity.HobbyEntity;
import com.simplilearn.api2.service.HobbyService;

@RestController
@RequestMapping("/hobby")
public class HobbyController {

	@Autowired
	HobbyService service;
	
	@PostMapping("/")
	public ResponseEntity<Object> saveHobby(@RequestBody HobbyEntity hobby){
		HobbyEntity entity= service.saveHobby(hobby);
		
		if(entity!=null)
			return new ResponseEntity<Object>(entity,HttpStatus.CREATED);
		else
			return new ResponseEntity<Object>("Error while inserting data",
					HttpStatus.INTERNAL_SERVER_ERROR);
	}
	@GetMapping("/{personId}")
	public ResponseEntity<String> findHobby(@PathVariable int personId){
		String resp= service.findByPersonId(personId);
		if(resp!=null)
			return new ResponseEntity<String>(resp,HttpStatus.FOUND);
		else
			return new ResponseEntity<String>("Hobby not avaibale",HttpStatus.NOT_FOUND);
	}
	
	
}
