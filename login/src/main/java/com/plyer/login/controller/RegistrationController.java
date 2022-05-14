package com.plyer.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.plyer.login.model.User;
import com.plyer.login.service.RegistrationService;

public class RegistrationController {

	@Autowired
	private RegistrationService service;
	@PostMapping("/registeruser")
	public User registerUser(@RequestBody User user) {
		User userObj = null;
		userObj = service.saveUser(user);
		return userObj;
	}
	@PostMapping("/login")
	public User loginUser(@RequestBody User user) throws Exception {
		String tempUsername = user.getUsername();
		String tempPassword = user.getPassword();
		User userObj = null;
		if(tempUsername !=null && tempPassword != null) {
			userObj = service.fetchUserByUsernameAndPassword(tempUsername, tempPassword);
		}
		if(userObj == null) {
			throw new Exception("Bad credentials");
		}
		return userObj;
	}
}
