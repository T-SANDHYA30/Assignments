package com.project.ThymeLeaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {
	
	@GetMapping("/")
	public String loginPage() {
		return "login";
	}
	
	@PostMapping("/login")
	public String login(@RequestParam("uname") String uname,@RequestParam("pwd")String pwd, Model model) {
		if(uname.equals("sandhya")&&pwd.equals("pwd")) {
			model.addAttribute("uname", uname);
			return "welcome";
		}
		else
			return "error";
	}

}
