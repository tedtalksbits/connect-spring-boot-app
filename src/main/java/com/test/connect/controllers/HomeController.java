package com.test.connect.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.test.connect.model.User;


@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String home() {
		System.out.println("in home controller");
		return "index";
	}
	
	@GetMapping("/goToBlog")
	public String goToBlog() {
		System.out.println("Going to blog page");
		
		return "blogs";
	}
	
	@GetMapping("/goToLogin")
	public String goToLogin() {
		System.out.println("going to login");
		
		return "login";
	}
	
	@GetMapping("/goToRegister")
	public String goToRegister() {
		System.out.println("going to register");
		
		return "register";
	}
	
//	Default object to add to JSP pages
	@ModelAttribute("newuser")
	public User getDefaultUser() {
		return new User();
	}
	
	@ModelAttribute("userTypes")
	public List<String> getUserTypes(){
		return Arrays.asList(new String[] {"user", "author"});
	}
}

