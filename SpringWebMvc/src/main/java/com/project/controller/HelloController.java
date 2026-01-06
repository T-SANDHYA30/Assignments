package com.project.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@ResponseBody
public class HelloController {
	
	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello....";
	}
	
	@RequestMapping("/myname")
	public ModelAndView getName() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("name");
		return mv;
		
	}
//	@RequestMapping("/date")
//		public String getDate() {
//		ModelAndView mv=new ModelAndView();
//		LocalDate date=LocalDate.now();
//		mv.setViewName("date");
//		mv.addObject("mydate",date);
//		
//		return date.toString();
//	}

}
