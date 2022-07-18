package com.simplilearn.restful.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.restful.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{

}
