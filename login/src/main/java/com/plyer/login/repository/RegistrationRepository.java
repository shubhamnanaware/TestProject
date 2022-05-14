package com.plyer.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.plyer.login.model.User;

public interface RegistrationRepository extends JpaRepository<User, Integer> {

	//public User findByUsernameAndPassword(String username,String password);

	public User findByUsernameAndPassword(String username, String password);


}
