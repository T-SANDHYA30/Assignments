package com.dao;

import java.util.List;

import com.entities.Passport;
import com.entities.Person;

public interface PersonDaoInterface {

	public List<Person> findAll();
	public void addPerson(Person person);
	public Person findById(Long id);
	public Passport findByPersonId(Long id);
	
	
	
	
	
	
}
