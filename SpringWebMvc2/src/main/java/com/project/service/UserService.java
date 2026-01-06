package com.project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.UserDao;
import com.project.model.User;

@Service
public class UserService {
	
	@Autowired
	UserDao dao;
	

	private static List<User> userList=new ArrayList<User>();
	

	public boolean doAuthenticate(String role,String uname,String pwd) {
		userList=(ArrayList<User>)dao.findAll();

		for(User u:userList) {
			if(u.getRole().equals(role)&&u.getUname().equals(uname)&&u.getPwd().equals(pwd))
				return true;
		}
		return false;
	}
	
	public User userDetails(Long uid) {
		userList=(ArrayList<User>)dao.findAll();
		for (User u:userList) {
			if(u.getUid()==uid)
				return u;
		}
		return null;

	}

	public User addUser(User user) {
		// TODO Auto-generated method stub
		userList.add(user);
		getUserList();
		return user;
		
	}

	public List<User> getUserList() {
		// TODO Auto-generated method stub
		userList.forEach(System.out::println);
		return null;
		
	}

}
