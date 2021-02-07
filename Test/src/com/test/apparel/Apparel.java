package com.test.apparel;

public class Apparel {
	private int itemCode;
	private String itemName;
	private double unitPrice;
	private String sizeandmaterial;
	private int quantity;

	public Apparel() {

	}

	public Apparel(int itemCode, String itemName, double unitPrice, String sizeandmaterial, int quantity) {
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.unitPrice = unitPrice;
		this.sizeandmaterial = sizeandmaterial;
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

	public String getSizeandmaterial() {
		return sizeandmaterial;
	}

	public void setSizeandmaterial(String sizeandmaterial) {
		this.sizeandmaterial = sizeandmaterial;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public boolean equals(Object obj) {
		Apparel e = (Apparel) obj;
		if (e.getItemCode() == this.getItemCode())
			return true;
		return false;

	}

	@Override
	public int hashCode() {

		return this.getItemCode();
	}

}
