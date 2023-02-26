package com.simplilearn.backend.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.backend.entiry.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer>{

}
