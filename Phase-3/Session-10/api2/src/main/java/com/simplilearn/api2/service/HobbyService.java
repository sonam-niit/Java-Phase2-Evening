package com.simplilearn.api2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.api2.entity.HobbyEntity;
import com.simplilearn.api2.repo.HobbyRepository;

@Service
public class HobbyService {

	@Autowired
	HobbyRepository repo;
	
	public HobbyEntity saveHobby(HobbyEntity hobby) {
		return repo.save(hobby);
	}
	
	public String findByPersonId(int personId) {
		return repo.findByPersonId(personId);
	}
}
