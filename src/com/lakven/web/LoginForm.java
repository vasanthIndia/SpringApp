package com.lakven.web;

import org.apache.struts.action.ActionForm;

public class LoginForm extends ActionForm{

	private String userName;
	private String password;

	public void setUserName(String userName){
		this.userName = userName;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public String getUserName(){
		return userName;
	}

	public String getPassword(){
		return password;
	}
}