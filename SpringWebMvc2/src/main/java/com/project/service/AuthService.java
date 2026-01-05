package com.project.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.project.model.User;

@Service
public class AuthService {
	
		
		private static ArrayList<User> userList=new ArrayList<User>();
		
		static {
			//ArrayList<User> userList=new ArrayList<User>();
			userList.add(new User("admin","admin123","admin","admin@gmail","9033333981"));
			userList.add(new User("sandhya","123","user","san@gmail","9033333983"));
			userList.add(new User("nandu","223","user","nandu@gmail.com","6304717499"));
			userList.add(new User("renu","333","manager","renu@gmail.com","9912376644"));
			userList.add(new User("viswa","admin23","admin","viswa@gmail","8790399490"));
		}
		
		
		public boolean doAuthenticate(String role,String uname,String pwd) {

			for(User u:userList) {
				if(u.getRole().equals(role)&&u.getUname().equals(uname)&&u.getPwd().equals(pwd))
					return true;
			}
			return false;
		}
		
		public User userDetails(String uname) {
			for (User u:userList) {
				if(u.getUname().equals(uname))
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

		private void getUserList() {
			// TODO Auto-generated method stub
			userList.forEach(System.out::println);
			
		}
}
			
			
			
			
			
			
			
			
			
			
		
		//if(uname.equals("admin")&&pwd.equals("admin@123")) {
//		if(role.equals("admin")&&uname.equals("admin")&&pwd.equals("admin@123")) {
//			return true;
//		}
//		else if(role.equals("user")&&uname.equals("sandhya")&&pwd.equals("123")){
//			return true;
//		}
//		else if(role.equals("manager")&&uname.equals("hr")&&pwd.equals("1234")){
//			return true;
//		}
//		else {
//			return false;
//		}
			
//	}
	
	

