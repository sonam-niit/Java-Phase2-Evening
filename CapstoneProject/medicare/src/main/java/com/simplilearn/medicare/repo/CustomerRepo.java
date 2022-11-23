package com.simplilearn.medicare.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.medicare.entity.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer>{

}
