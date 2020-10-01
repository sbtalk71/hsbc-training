package com.hsbc.tr.web.dao;

/**
 * 
 * @author Megha agarwal
 * Dao interface for accessing customer and request tables
 *
 */
public interface CustomerDao {
	
	/**
	 * method to register new user using the parameteres
	 * @param email
	 * @param fname
	 * @param lname
	 * @param pno
	 */
	public void registerUser(String email,String fname, String lname, String pno);
	
	/**
	 * Method to check whether user exist using the email and return name of customer if its record exists
	 * @param email
	 * @return
	 */
	public String checkUser(String email);
	
	/**
	 * Method to save the request in the database
	 * @param email
	 * @param software
	 * @param os
	 * @param problem
	 */
	public void saveRequest(String email, String software,String os, String problem);
	

}
