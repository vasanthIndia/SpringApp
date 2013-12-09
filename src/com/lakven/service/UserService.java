package com.lakven.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lakven.dataaccess.UserDAOIntf;

@Component
public class UserService implements UserServiceIntf {

	@Autowired
	private UserDAOIntf dao;
	
	public boolean validateLogin(String userName, String password) {
		
		return dao.validateLogin(userName, password);
	}

}
