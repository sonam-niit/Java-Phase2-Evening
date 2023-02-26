package com.simplilearn.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.backend.entiry.Customer;
import com.simplilearn.backend.repo.CustomerRepo;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerRepo repo;

	@Override
	public Customer register(Customer cust) {
		return repo.save(cust);
	}

	@Override
	public List<Customer> getAllCustomers() {
		return repo.findAll();
	}

	@Override
	public Customer getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer updateProfile(Customer cust) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteCustomer(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Customer login(Customer cust) {
		// TODO Auto-generated method stub
		return null;
	}

}
