package com.simplilearn.restful.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.restful.entity.User;
import com.simplilearn.restful.repo.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo repo;
	
	public User addUser(User user) {
		return repo.save(user);
	}
	public List<User> getAllUsers(){
		return repo.findAll();
	}
	public User getUserById(int id) {
		
		if(repo.findById(id).isPresent())
			return repo.findById(id).get();
		else
			return null;
	}
	public User updateUser(User user, int id) {
		if(repo.findById(id).isPresent())
		{
			User old= repo.findById(id).get();
			old.setCountry(user.getCountry());
			old.setName(user.getName());
			old.setEmail(user.getEmail());
			old.setPassword(user.getPassword());
			
			
			return repo.save(old);
		}
		else
			return null;
	}
	public boolean deleteUser(int id) {
		if(repo.findById(id).isPresent())
		{
			repo.deleteById(id);
			return true;
		}
		return false;
	}
}









