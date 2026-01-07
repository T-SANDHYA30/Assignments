package com.project.SpringCoreAndContext.beans;

import java.util.Arrays;

public class Person {

	private int id;
	private String name;
	private int age;
	private Address addr;
	private String langs[]=new String[3];
	
	
	public Person(int id, String name, int age, Address addr
			, String[] langs
			) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.langs = langs;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", addr=" + addr + 
				", langs="+ Arrays.toString(langs) + 
				"]";
	}

	
	
	
	
	
}
