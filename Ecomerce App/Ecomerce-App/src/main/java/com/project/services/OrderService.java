package com.project.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.daos.ItemDao;
import com.project.daos.OrderDao;

public class OrderService implements OrderServiceInterface{
	
	@Autowired
	OrderDao dao;
	ItemDao IDao;
	public Object findAll() {
		return dao.findAll();
	}
	public Object findById(Long id) {
		return null;
	}
	
	

}
