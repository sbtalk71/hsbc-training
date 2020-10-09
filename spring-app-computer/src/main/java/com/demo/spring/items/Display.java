package com.demo.spring.items;

public class Display {
	private String displayType;
	private String displayMemory;
	private String resolution;
	public String getDisplayType() {
		return displayType;
	}
	public void setDisplayType(String displayType) {
		this.displayType = displayType;
	}
	public String getDisplayMemory() {
		return displayMemory;
	}
	public void setDisplayMemory(String displayMemory) {
		this.displayMemory = displayMemory;
	}
	public String getResolution() {
		return resolution;
	}
	public void setResolution(String resolution) {
		this.resolution = resolution;
	}
	
	public String getSpecs() {
		return displayType+" "+resolution+" "+displayMemory;
	}
}
