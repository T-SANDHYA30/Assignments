package com.project.SpringCoreAndContext.beans;

public class Hello {
	
	private String name;
	
	public Hello() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Hello(String name) {
		super();
		this.name = name;
	}



	public void setName(String name) {
		this.name = name;
	}

	public String sayHello() {
		return "Hello....!"+name;
	}

}
