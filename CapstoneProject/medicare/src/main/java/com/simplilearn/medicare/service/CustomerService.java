package com.simplilearn.medicare.service;

import java.util.List;

import com.simplilearn.medicare.entity.Customer;

public interface CustomerService {

	public Customer saveCustomer(Customer c); //create Customer
	public List<Customer> getAllCustomers(); //getAll Customers
	public Customer updateCustomer(Customer c,int id); //update customer by Id
	public boolean deleteCustomer(int id); //delete customer By Id
	public Customer getCustById(int id); //find customer by id
}
