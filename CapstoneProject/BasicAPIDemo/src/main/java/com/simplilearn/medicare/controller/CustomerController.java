package com.simplilearn.medicare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.medicare.entity.Customer;
import com.simplilearn.medicare.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService service;
	@PostMapping("/api/customer")
	public Customer saveCustomer(@RequestBody Customer c) {
		return service.saveCustomer(c);
	}
	@GetMapping("/api/customer")
	public List<Customer> getAll(){
		return service.getAllCustomers();
	}
}
