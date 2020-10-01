package com.hsbc.tr.web;
/**
 * @author Muskan Karnani
 * this is the service layer class using the entity Customer object to make calls to the methods
 */

public class CustomerDao {
	private Customer dao;
	public CustomerDao()
	{
		this.dao=new Customer();
	}
	
	public boolean validate(String email)
	{
		if((dao.validateData(email)).equals("success"))
			return true;
		return false;
	}
	public boolean save(String email, String software, String os, String problem)
	{
		if(dao.saveData(email, software, os, problem).equals("success"))
			return true;
		return false;
	}
	public boolean register(String email, String fname, String lname, String phone) {
		if(dao.registerData(email,fname,lname,phone).equals("success"))
			return true;
		return false;
	}

}
