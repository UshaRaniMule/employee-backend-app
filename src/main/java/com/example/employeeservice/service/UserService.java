package com.example.employeeservice.service;

import com.example.employeeservice.model.User;

public interface UserService {

	User getUserByUsername(String username);
	
	User saveUser(User user);
}
