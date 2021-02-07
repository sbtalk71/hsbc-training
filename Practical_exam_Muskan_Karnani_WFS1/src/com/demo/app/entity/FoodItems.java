/**
 * @author Muskan Karnani
 * This is the entity class names FoodItem
 */

package com.demo.app.entity;

public class FoodItems {
	private int itemCode;
	private String name;
	private double unitPrice;
	private String dateMan;
	private String dateExp;
	private String veg;
	private double qty;
	//defauls constructor
	//parameterized constructor
	public FoodItems() {
		
	}
	public FoodItems(int itemCode, String name, double unitPrice, String dateMan, String dateExp, String veg, double qty)
	{
		this.itemCode=itemCode;
		this.name=name;
		this.unitPrice=unitPrice;
		this.dateMan=dateMan;
		this.dateExp=dateExp;
		this.veg=veg;
		this.qty=qty;
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
	public String getDateMan() {
		return dateMan;
	}
	public void setDateMan(String dateMan) {
		this.dateMan = dateMan;
	}
	public String getDateExp() {
		return dateExp;
	}
	public void setDateExp(String dateExp) {
		this.dateExp = dateExp;
	}
	public String getVeg() {
		return veg;
	}
	public void setVeg(String veg) {
		this.veg = veg;
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
		FoodItems f=(FoodItems)obj;
		if(this.getItemCode()==f.getItemCode())
			return true;
		return false;
	}
	
	
	

}
