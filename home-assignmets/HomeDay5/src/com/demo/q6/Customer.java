package com.demo.q6;

import java.io.Serializable;

public class Customer implements Serializable{

	private int customerId;
	private String name;
	private String address;
	
	public Customer() {
		
	}
	
	public Customer(int id,String name,String address) {
		this.customerId=id;
		this.name=name;
		this.address=address;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
