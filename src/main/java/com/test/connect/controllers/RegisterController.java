package com.test.connect.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.test.connect.model.User;
import com.test.connect.repository.UserRepository;

@Controller
public class RegisterController {
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/registerUser")
	public String registerUser(@Valid @ModelAttribute("newuser") User user, BindingResult result, Model model) {
		System.out.println("in register controller");
		
		System.out.println("errors found: " + result.hasErrors());
		// check for validation errors AKA if any of the checks fail
		if(result.hasErrors()) {
			System.out.println("validation error occured!");
			return "register";
		}
		if(user.getUserType() == null) {
			user.setUserType("user");
		}
		userRepository.save(user);
		
		model.addAttribute("dataSaved", "User registered successfully");
		model.addAttribute("newUsername", user.getUsername());
		
		return "login";
		
	}
	
	
	
}
