package com.hsbc.exam.entity;

/**
 * 
 * @author Megha agarwal
 * Electronics class is entity, subclass of Product class
 *
 */
public class Electronics extends Product{

	private int warranty;
	
	
	public Electronics() {
		
	}
	
	public Electronics(int code,String name,double price,int warranty,int quantity) {
		super(code,name,price,quantity);
		this.warranty=warranty;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}


	
	
}
