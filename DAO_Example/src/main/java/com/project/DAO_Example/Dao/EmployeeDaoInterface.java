package com.project.DAO_Example.Dao;

import java.util.List;

import com.model.Employee;

public interface EmployeeDaoInterface {
	
	public List<Employee> findAll();
	public Employee findById(int i);
	public void addEmployee();
	public Employee updateEmployee(Employee employee,int id);
	public void deleteEmployee(int id);
	public List<Employee> findByDept(String dept);
	public List<Employee> findByFilters(String dept, String desg, double salary);


}
