package com.test.electronics;

public class Electronics  {
	private int itemCode;
	private String itemName;
	private double Price;
	private int warranty;
	private int quantity;
	

	public Electronics() {

	}

	public Electronics(int itemCode, String itemName, double Price, int warranty, int quantity) {
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.Price = Price;
		this.warranty = warranty;
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

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public boolean equals(Object obj) {
		Electronics e = (Electronics) obj;
		if (e.getItemCode() == this.getItemCode())
			return true;
		return false;

	}

	@Override
	public int hashCode() {

		return this.getItemCode();
	}
	
	

}
