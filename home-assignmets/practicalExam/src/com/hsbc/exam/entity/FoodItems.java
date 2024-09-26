package com.hsbc.exam.entity;

/**
 * 
 * @author Megha agarwal
 * FoodItem as subclass of Product class(entity class)
 *
 */
public class FoodItems extends Product{
	
	private String dateOfMan;
	private String dateOfExpiry;
	private boolean vegetarian;
	
	public FoodItems() {
		
	}
	
	public FoodItems(int id, String name,double price,String dateOfMan,String dateOfExpiry, boolean vegetarian, int quantity) {
		super(id,name,price,quantity);
		this.dateOfMan=dateOfMan;
		this.dateOfExpiry=dateOfExpiry;
		this.vegetarian=vegetarian;
	
	}

	public String getDateOfMan() {
		return dateOfMan;
	}

	public void setDateOfMan(String dateOfMan) {
		this.dateOfMan = dateOfMan;
	}

	public String getDateOfExpiry() {
		return dateOfExpiry;
	}

	public void setDateOfExpiry(String dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}

	
	
	

}
