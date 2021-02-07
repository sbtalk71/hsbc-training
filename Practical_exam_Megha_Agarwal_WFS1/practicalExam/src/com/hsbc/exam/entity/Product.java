package com.hsbc.exam.entity;

public class Product {
	protected int itemCode;
	protected String itemName;
	protected double unitPrice;
	protected double quantity;
	
	public Product() {
		
	}
	
	public Product(int code,String name,double price,double quantity) {
		this.itemCode=code;
		this.itemName=name;
		this.unitPrice=price;
		this.quantity=quantity;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public int getItemCode() {
		return itemCode;
	}

	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	


}
