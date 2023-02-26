package com.simplilearn.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.backend.entiry.Customer;
import com.simplilearn.backend.service.CustomerService;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

	@Autowired
	private CustomerService service;
	
	@PostMapping("")
	public ResponseEntity<Object> custRegistration(@RequestBody Customer cust){
		//calling method to save object and taking response in var name created
		Customer created= service.register(cust);
		if(created!=null)
			return new ResponseEntity<Object>(created,HttpStatus.CREATED);
		else
			return new ResponseEntity<Object>("Error while creating an object",
					HttpStatus.INTERNAL_SERVER_ERROR);
	}
	@GetMapping("")
	public List<Customer> getAll(){
		return service.getAllCustomers();
	}
	
}
