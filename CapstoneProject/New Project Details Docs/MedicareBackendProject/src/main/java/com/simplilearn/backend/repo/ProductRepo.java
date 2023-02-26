package com.simplilearn.backend.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.backend.entiry.Product;
@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{

}
