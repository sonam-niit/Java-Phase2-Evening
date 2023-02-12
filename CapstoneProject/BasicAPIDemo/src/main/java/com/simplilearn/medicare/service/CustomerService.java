package com.simplilearn.medicare.service;

import java.util.List;

import com.simplilearn.medicare.entity.Customer;

public interface CustomerService {

	public Customer saveCustomer(Customer c); //abstract method
	public List<Customer> getAllCustomers();
}
