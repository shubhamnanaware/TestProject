package com.plyer.login.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.plyer.login.model.User;
import com.plyer.login.repository.RegistrationRepository;

public class RegistrationService {
	@Autowired
	private RegistrationRepository repo;
	public User saveUser(User user) {
		return repo.save(user);
	}
	public User fetchUserByUsernameAndPassword(String username,String password) {
		return repo.findByUsernameAndPassword(username, password);
	}
}

