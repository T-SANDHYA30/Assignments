package com.project.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.Entities.Employee;
import com.project.service.EmployeeService;

@RestController
public class EmployeeController {
	
	private static final Logger logger=LoggerFactory.getLogger(EmployeeController.class);
	
	@Autowired
	EmployeeService service;
	
	@GetMapping("/")
	public List<Employee> findAll(){
		logger.info("findAll Started");
		return service.findAll();
	}
	
	@GetMapping("/{id}")
	public Employee findById(@PathVariable Long id) {
		logger.info("retrieving employee by id");
		return service.findById(id);
	}
	
	@PostMapping("/")
	public Employee save(@RequestBody Employee employee) {
		logger.info("saving an employee");
		return service.save(employee);
	}
	
	@GetMapping("/{name}")
	public Employee findByEname(@PathVariable String name) {
		return service.findByEname(name);
	}
	
	public List<Employee> findBySalary(@PathVariable double salary){
		return service.findBySalary(salary);
		
	}
	

}
