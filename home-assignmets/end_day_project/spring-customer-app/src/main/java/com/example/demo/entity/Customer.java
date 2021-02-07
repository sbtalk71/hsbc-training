package com.example.demo.entity;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author Megha Agarwal
 *
 */
@XmlRootElement
public class Customer {

	private int customerId;
	private String customerName;
	private String mobile;
	
	public Customer() {
		
	}

	public Customer(int costomerId, String customerName, String mobile) {
		super();
		this.customerId = costomerId;
		this.customerName = customerName;
		this.mobile = mobile;
	}

	public int getCustomerId() {
		return customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getMobile() {
		return mobile;
	}
	
	
	
	
}
