/**
 * @author Muskan Karnani
 * This is the entity class names Apparel
 */

package com.demo.app.entity;

public class Apparel {
	private int itemCode;
	private String name;
	private double unitPrice;
	private String size;
	private String material;
	private double qty;
	//default constructor
	public Apparel() {
		
	}
//parameterized constructor
	public Apparel(int itemCode, String name, double unitPrice, String size, String material, double qty) {
		super();
		this.itemCode = itemCode;
		this.name = name;
		this.unitPrice = unitPrice;
		this.size = size;
		this.material = material;
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

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
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
		Apparel a=(Apparel)obj;
		if(this.getItemCode()==a.getItemCode())
			return true;
		return false;
	}
	
	

}
