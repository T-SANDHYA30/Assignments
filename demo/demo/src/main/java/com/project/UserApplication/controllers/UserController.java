package com.project.UserApplication.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.UserApplication.Entities.User;
import com.project.UserApplication.services.UserService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/user")
@Tag(name="User Apis")
public class UserController {
	
	@Autowired
	UserService service;
	
	@GetMapping("/")
	@Operation(summary ="find all users")
	@ApiResponse(responseCode = "200", description = "Retrieves all Users info")
	public List<User> findAll(){
		return service.findAll();
	}
	
	@GetMapping("/{id}")
	@Operation(summary ="find user by userId")
	@ApiResponse(responseCode = "200", description = "user exists with id ")
	@ApiResponse(responseCode = "204", description = "user not found ")
	public User findById(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping("/")
	@Operation(summary ="user created")
	@ApiResponse(responseCode = "200", description = "user Added")
	public User save(@Valid @RequestBody User user) {
		return service.save(user);
	}
}