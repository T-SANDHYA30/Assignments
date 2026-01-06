package com.project.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.project.model.User;

@Repository
public class UserDao {
	
	@Autowired
	private HibernateTemplate template;
	
	public List<User> findAll(){
		
		return template.loadAll(User.class);
		
	}
	
	public void save(User u) {
		template.save(u);
	}
	
	public User findById(Long id) {
		return template.get(User.class,id);
	}

}
