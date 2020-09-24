package com.test.fooditems;

public class FoodItems {
	private int itemCode;
	private String itemName;
	private double unitPrice;
	private String DOM;
	private String DOE;
	private boolean Veg;
	private int quantity;

	public FoodItems() {

	}

	public FoodItems(int itemCode, String itemName, double unitPrice, String DOM, String DOE, boolean Veg,
			int quantity) {
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
		this.DOM = DOM;
		this.DOE = DOE;
		this.Veg = Veg;

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

	public String getDOM() {
		return DOM;
	}

	public void setDOM(String dOM) {
		DOM = dOM;
	}

	public String getDOE() {
		return DOE;
	}

	public void setDOE(String dOE) {
		DOE = dOE;
	}

	public boolean isVeg() {
		return Veg;
	}

	public void setVeg(boolean veg) {
		Veg = veg;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public boolean equals(Object obj) {
		FoodItems e = (FoodItems) obj;
		if (e.getItemCode() == this.getItemCode())
			return true;
		return false;

	}

	@Override
	public int hashCode() {

		return this.getItemCode();
	}

}
