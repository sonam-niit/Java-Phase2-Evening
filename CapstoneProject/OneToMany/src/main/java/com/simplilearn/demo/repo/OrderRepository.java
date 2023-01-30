package com.simplilearn.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.demo.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>{

}
