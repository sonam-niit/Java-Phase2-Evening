package com.simplilearn.medicare.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.simplilearn.medicare.entity.Customer;

@Repository
public class CustomerRepository {

	List<Customer> list= new ArrayList<>();
	
	public Customer saveCustomer(Customer c) {
		list.add(c);
		return c;
	}
	public List<Customer> getAllCustomer(){
		return list;
	}
}
