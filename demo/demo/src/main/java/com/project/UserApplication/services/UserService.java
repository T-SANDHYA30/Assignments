package com.project.UserApplication.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.UserApplication.Entities.User;
import com.project.UserApplication.repositories.UserRepository;



@Service
public class UserService {
	
	@Autowired
	UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
	    return repository.findById(id).orElse(null);
	}

	
	public User save(User user) {
		return repository.save(user);
	}

}
