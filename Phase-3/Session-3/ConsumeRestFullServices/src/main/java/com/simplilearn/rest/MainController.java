package com.simplilearn.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MainController {

	@GetMapping("/users/{id}")
	public ResponseEntity<User> readData(@PathVariable("id") String id) {
		
		RestTemplate template= new RestTemplate();
		User user=template.getForObject("https://jsonplaceholder.typicode.com/users/"+id, User.class);
		return new ResponseEntity<User>(user,HttpStatus.FOUND);
	}
	
	@GetMapping("/users")
	public User[] readAllData() {
		RestTemplate template= new RestTemplate();
		User users[]=template.getForObject("https://jsonplaceholder.typicode.com/users/", User[].class);
		return users;
	}
	
}
