package com.hsbc.exam.entity;

public class Apparel extends Product{
	
	private String size;
	private String material;
	private double quantity;
	
	public Apparel() {
		
	}
	
	public Apparel(int code, String name,double price, String size,String material,double quantity) {
		super(code,name,price,quantity);
		this.size=size;
		this.material=material;
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


	
	

}
