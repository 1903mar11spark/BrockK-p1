package com.revature.service;

import com.revature.model.Credentials;
import com.revature.model.User;

public class AuthService {

	public User isValidUser(Credentials creds) {
		User u = null;
		String username = creds.getUsername();
		String password = creds.getPassword();
		if (username != null && password != null) {
			// this is fake authentication!
			if (username.equals("David") && password.equals("Higgins75")) {
				u = new User(6, username, "David", "Higgins", "Higgins75@srtusa.com");
			}
		}
		return u;
	}

}
