package com.hsbc.tr.web;

import java.util.List;

public class TechSupportService {

	private TechSupportDao dao;

	public TechSupportService(TechSupportDao dao) {
		this.dao = dao;
	}

	public boolean validateUser(String email) {
		int response = dao.checkUser(email);
		if (response == 1) {
			return true;
		} else {
			return false;
		}
	}

	public boolean registerUser(String email, String fname, String lname, String phone) {
		String response=dao.saveUser(email, fname, lname, phone);
		if(response.equals("success")) {
		return true;
		}else {
			return false;
		}
	}

	public boolean registerComplaint(String email, String os, String software, String problem) {
		String response=dao.saveRequest(email, os, software, problem);
		if(response.equals("success")) {
		return true;
		}else {
			return false;
		}
	}

	public List<String> listAll() {
		// TODO Auto-generated method stub
		return dao.listAllRequests();
	}
}
