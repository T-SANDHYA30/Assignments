package com.dao;

import java.util.List;

import com.entities.Passport;


public interface PassportDaoInterface {
	
	public List<Passport> findAll();
	public void addPassport(Passport passport);
	public Passport findById(long id);

}
