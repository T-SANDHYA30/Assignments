package com.project.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;

@Entity
@NamedQuery(name="findByName",query="select e from Employee e where e.ename=:name")
public class Employee {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long eid;
	private String ename;
	private double salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String ename, double salary) {
		super();
		this.ename = ename;
		this.salary = salary;
	}
	public Long getEid() {
		return eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}
