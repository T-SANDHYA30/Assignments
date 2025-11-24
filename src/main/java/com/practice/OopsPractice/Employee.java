package com.practice.OopsPractice;

public class Employee {
	
	private String empname;
	private int empid;
	private String designation;
	private String num;
	
	public Employee(String empname, int empid, String designation, String num) {
		super();
		this.empname = empname;
		this.empid = empid;
		this.designation = designation;
		this.num = num;
	}

	public Employee() {
		super();
		
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}
	
	

}


