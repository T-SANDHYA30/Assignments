package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.model.User;
import com.project.service.AuthService;

@Controller

public class DemoController {
	
	@Autowired
	AuthService service;
	
	@RequestMapping("/demo")
	public ModelAndView login() {
		ModelAndView mv=new ModelAndView("login");
		return mv;
	}
	//@RequestMapping("/home")
	//public ModelAndView home(@RequestParam("uname") String uname,@RequestParam("pwd")String pwd) {
				
	//@RequestMapping("/home/{uname}/{pwd}")
	//public ModelAndView home(@PathVariable String uname,@PathVariable String pwd) {
		
		@RequestMapping("/home/{role}")
		public ModelAndView home(@PathVariable("role") String role, @RequestParam("uname") String uname,@RequestParam("pwd")String pwd) {
		
		boolean result=service.doAuthenticate(role,uname,pwd);
		if(result) {
			ModelAndView mv= new ModelAndView("home");
			mv.addObject("username",uname);
			return mv;
		}
		else
			return new ModelAndView("error");
	}
		
		@RequestMapping("/userInfo/{uname}")
		public ModelAndView userDetails(@PathVariable String uname) {
			User user=new User();
			user=service.userDetails(uname);
			ModelAndView mv=new ModelAndView("info");
			mv.addObject("user",user);
			return mv;
		}
		
		@RequestMapping(value="/addUser", method=RequestMethod.POST)
		public ModelAndView addUser(@ModelAttribute("user")User user) {
			User u=service.addUser(user);
			ModelAndView mv=new ModelAndView("result");
			mv.addObject("username",u.getUname());
			return mv;
		}
		
		@RequestMapping("/signup")
		public ModelAndView add() {
			return new ModelAndView("add");
		}

}
