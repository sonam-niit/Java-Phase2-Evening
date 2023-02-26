package com.simplilearn.backend.service;

import java.util.List;

import com.simplilearn.backend.entiry.Customer;

public interface CustomerService {

	public Customer register(Customer cust);
	public List<Customer> getAllCustomers();
	public Customer getById(int id);
	public Customer updateProfile(Customer cust);
	public boolean deleteCustomer(int id);
	public Customer login(Customer cust);
}
