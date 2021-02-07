/**
 * @author Muskan Karnani
 * This is the entity class names Electronics
 */

package com.demo.app.entity;

public class Electronics {
	private int itemCode;
	private String name;
	private double unitPrice;
	private double warranty;
	private double qty;
	//default constructor

	public Electronics() {
		
	}
	//parameterized constructor
	public Electronics(int itemCode, String name, double unitPrice, double warranty, double qty) {
		super();
		this.itemCode = itemCode;
		this.name = name;
		this.unitPrice = unitPrice;
		this.warranty = warranty;
		this.qty = qty;
	}
	//getters and setters
	public int getItemCode() {
		return itemCode;
	}
	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public double getWarranty() {
		return warranty;
	}
	public void setWarranty(double warranty) {
		this.warranty = warranty;
	}
	public double getQty() {
		return qty;
	}
	public void setQty(double qty) {
		this.qty = qty;
	}
	//overriding the hashCode() and equals() of Object Class
	@Override
	public int hashCode() {
		
		return this.getItemCode();
	}
	@Override
	public boolean equals(Object obj) {
		Electronics e=(Electronics)obj;
		if(this.getItemCode()==e.getItemCode())
			return true;
		return false;
	}
	
	
	
	
}
