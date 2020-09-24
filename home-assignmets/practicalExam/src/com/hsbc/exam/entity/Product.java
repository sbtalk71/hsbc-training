package com.hsbc.exam.entity;

/**
 * 
 * @author Megha agarwal
 * entity class
 * Product class as base class for all the three pruducts
 *
 */
public class Product {
	protected int itemCode;
	protected String itemName;
	protected double unitPrice;
	protected int quantity;
	
	public Product() {
		
	}
	
	public Product(int code,String name,double price,int  quantity) {
		this.itemCode=code;
		this.itemName=name;
		this.unitPrice=price;
		this.quantity=quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
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
	
	
	/**
	 * This is to be used in Custom sort Class defind in DaoImpl class in dao layer
	 */
@Override
public boolean equals(Object obj) {
	Product p1=(Product)obj;
	if(p1.getQuantity()==this.quantity)
		return true;
	return false;
}

}
