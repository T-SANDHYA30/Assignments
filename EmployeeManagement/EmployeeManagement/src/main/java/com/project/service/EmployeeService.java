package com.project.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Entities.Employee;
import com.project.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	private static final Logger logger=LoggerFactory.getLogger(Employee.class);
	
	@Autowired
	EmployeeRepository repository;
	
	public List<Employee> findAll(){
		logger.info("fetching all employee");		
		return repository.findAll();
	}
	
	public Employee findById(Long id) {
		logger.info("retrieving employee by id");
		return repository.findById(id).get();
	}
	
	public Employee save(Employee employee) {
		logger.info("saving an employee");
		return repository.save(employee);
	}

	public Employee findByEname(String name) {

		//return repository.findByEname(name);
		return repository.findByEmployeeName(name);
	}

	public List<Employee> findBySalary(double salary) {
		// TODO Auto-generated method stub
		return repository.findBySalary(salary);
	}
	

}
