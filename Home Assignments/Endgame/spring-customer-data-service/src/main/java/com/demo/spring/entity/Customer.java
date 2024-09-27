package com.demo.spring.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer {
	private int customerId;
	private String customerName;
	private String mobile;
	public Customer()
	{
		
	}
	public Customer(int customerId, String customerName, String mobile) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.mobile = mobile;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
