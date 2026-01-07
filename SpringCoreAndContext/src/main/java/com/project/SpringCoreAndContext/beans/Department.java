package com.project.SpringCoreAndContext.beans;

public class Department {
	
	private int did;
	private String dname;
	
	
	public void setDid(int did) {
		this.did = did;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Department [did=" + did + ", dname=" + dname + "]";
	}
	
	
	

}
