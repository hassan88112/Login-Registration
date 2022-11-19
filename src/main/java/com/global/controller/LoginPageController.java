package com.global.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.global.Entity.LoginPage;
import com.global.service.LoginPageService;

@Controller
public class LoginPageController {

	@Autowired
	private LoginPageService loginPageService;
	
	@GetMapping("/")
	private String home() {
		
		return "index";
	}
	
	
	@PostMapping("/sign_in")
	public String login(@ModelAttribute LoginPage l ) {	
		loginPageService.addUser(l);
		return "Sign_up";
	}
	
	@PostMapping("/sign_in_page")
	public String website(@ModelAttribute LoginPage l ) {	
		loginPageService.addUser(l);
		return "vision";
	}
	
	@PostMapping("/sign_up")
	public String singup(@ModelAttribute LoginPage l ) {	
		loginPageService.addUser(l);
		return "index";
	}
}
