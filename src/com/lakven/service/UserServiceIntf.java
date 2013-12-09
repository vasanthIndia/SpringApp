package com.lakven.service;

import org.springframework.stereotype.Component;


public interface UserServiceIntf {

	public boolean validateLogin(String userName, String password);
}
