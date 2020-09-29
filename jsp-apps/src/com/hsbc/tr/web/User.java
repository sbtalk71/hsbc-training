package com.hsbc.tr.web;

import java.util.ArrayList;
import java.util.List;

public class User {

	private String userName;
	private String password;
	private boolean authenticated;
	private List<String> users = new ArrayList<String>();

	public User() {
		users.add("Suman");
		users.add("Chaman");
		users.add("Kiran");
		users.add("Rajan");
		users.add("Raman");
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isAuthenticated() {
		if (userName.equals(password)) {
			return true;
		} else {
			return false;
		}
	}

	public void setAuthenticated(boolean authenticated) {
		this.authenticated = authenticated;
	}

	public List<String> getUsers() {
		return users;
	}

	public void setUsers(List<String> users) {
		this.users = users;
	}
}
