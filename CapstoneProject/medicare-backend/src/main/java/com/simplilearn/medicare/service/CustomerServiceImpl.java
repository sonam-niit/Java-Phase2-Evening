package com.simplilearn.medicare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.medicare.entity.Customer;
import com.simplilearn.medicare.repo.CustomerRepo;

@Service
public class CustomerServiceImpl implements CustomerService {

	//injected the Repo dependency
	@Autowired
	CustomerRepo repo;

	@Override
	public Customer saveCustomer(Customer c) {
		return repo.save(c);
	}

	@Override
	public List<Customer> getAllCustomers() {
		return repo.findAll();
	}

	@Override
	public Customer updateCustomer(Customer newData, int id) {
		if (repo.findById(id).isPresent()) {
			Customer oldData = repo.findById(id).get();
			oldData.setName(newData.getName());
			oldData.setEmail(newData.getEmail());
			oldData.setAddress(newData.getAddress());

			return repo.save(oldData);
		} else
			return null;
	}

	@Override
	public boolean deleteCustomer(int id) {
		if (repo.findById(id).isPresent()) {
			repo.deleteById(id);
			return true;
		}
		return false;
	}

	@Override
	public Customer getCustById(int id) {
		if (repo.findById(id).isPresent()) {
			return repo.findById(id).get();
		}
		return null;
	}

}
