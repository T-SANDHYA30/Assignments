package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.User;
import com.project.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService service;
	
	@GetMapping("/user/{id}")
	public User userDetails(@PathVariable Long id){
		return service.userDetails(id);
	}
	
	@PostMapping("/user")
	public User addUser(@RequestBody User user) {
	return service.addUser(user);
    }
	@GetMapping("/user")
	public List<User> getUserList(){
		return service.getUserList();
	}

}
