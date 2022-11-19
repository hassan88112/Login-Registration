package com.global.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.global.Entity.LoginPage;
import com.global.repositary.LoginPageRepos;

@Service
public class LoginPageService {

	@Autowired
	private LoginPageRepos loginPageRepos;
	
	public void addUser(LoginPage l) {
		
		 loginPageRepos.save(l);
	}
}
