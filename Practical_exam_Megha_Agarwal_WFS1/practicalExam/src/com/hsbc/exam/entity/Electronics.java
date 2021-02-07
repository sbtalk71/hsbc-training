package com.hsbc.exam.entity;

public class Electronics extends Product{

	private int warranty;
	private double quantity;
	
	public Electronics() {
		
	}
	
	public Electronics(int code,String name,double price,int warranty,double quantity) {
		super(code,name,price,quantity);
		this.warranty=warranty;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	
	
}
