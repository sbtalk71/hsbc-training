package com.hsbc.tr.web.entity;

/**
 * 
 * @author Megha agarwal
 *Customer entity class
 */
public class Customer {
	
	private String email;
	private String fname;
	private String lname;
	private String pno;
	
	public Customer() {
		
	}
	
	public Customer(String email,String fname,String lname, String pno) {
		this.email=email;
		this.fname=fname;
		this.lname=lname;
		this.pno=pno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getPno() {
		return pno;
	}

	public void setPno(String pno) {
		this.pno = pno;
	}
	
	

}
