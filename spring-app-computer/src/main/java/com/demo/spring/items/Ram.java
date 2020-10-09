package com.demo.spring.items;

public class Ram {
	private String ramType;
	private int ramSize;

	public Ram() {
	}

	public String getRamType() {
		return ramType;
	}

	public void setRamType(String ramType) {
		this.ramType = ramType;
	}

	public int getRamSize() {
		return ramSize;
	}

	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}
	
	public String getSpecs() {
		return ramType+" "+ramSize;
	}
}
