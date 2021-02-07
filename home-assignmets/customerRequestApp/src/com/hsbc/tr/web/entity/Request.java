package com.hsbc.tr.web.entity;

/**
 * 
 * @author Megha agarwal
 * Service Request entity class
 *
 */
public class Request {

	private String email;
	private String os;
	private String software;
	private String problem;
	
	public Request() {
		
	}
	
	public Request(String email,String os, String software, String problem) {
		this.email=email;
		this.os=os;
		this.software=software;
		this.problem=problem;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getSoftware() {
		return software;
	}

	public void setSoftware(String software) {
		this.software = software;
	}

	public String getProblem() {
		return problem;
	}

	public void setProblem(String problem) {
		this.problem = problem;
	}
	
	
}
