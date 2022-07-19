package com.simplilearn.api1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.api1.entity.PersonEntity;
import com.simplilearn.api1.entity.Response;
import com.simplilearn.api1.service.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {

	@Autowired
	PersonService service;
	
	@PostMapping("/")
	public ResponseEntity<Object> addPerson(@RequestBody PersonEntity person){
		PersonEntity resp= service.addPerson(person);
		if(resp!=null)
			return new ResponseEntity<Object>(resp,HttpStatus.CREATED);
		else
			return new ResponseEntity<Object>("Error while inserting data",
					HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@GetMapping("/{personId}")
	public ResponseEntity<Object> getPersonWithHobby(@PathVariable int personId){
		
		Response resp=service.getPersonWithHobby(personId);
		
		if(resp!=null)
			return new ResponseEntity<Object>(resp,HttpStatus.FOUND);
		else
			return new ResponseEntity<Object>("No Person available with given ID",
					HttpStatus.NOT_FOUND);
	}
	
}
