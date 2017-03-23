package com.tluzar.library;

import java.util.List;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

public class Login {

	private List<User> logins;

	
	 public Login(List<User> logins) {
		super();
		this.logins = logins;
	}


	public boolean validateLogin(String username, String password) {
		boolean validateLogin = false;
		for (User user: logins) {
			if(user.getUsername().equals(username) && user.getPassword().equals(password)) {
				validateLogin = true;
			}
		}
			
		return validateLogin;
	} 
	 
	public String getDetails (String username) {
		String details = "";
		for (User user: logins) {
			if(user.getUsername().equals(username)) {
				details = "Name: " + user.getName() + " |" +
					    "Address: " + user.getAddress() + " |" +
					    "Phone: " + user.getPhone();
			}		
		}
		
		return details;
	}	

}
