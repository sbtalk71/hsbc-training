package com.demo.spring.items;

public class Storage {
	private String storageType;
	private int storageSize;
	public Storage() {
	}
	public String getStorageType() {
		return storageType;
	}
	public void setStorageType(String storageType) {
		this.storageType = storageType;
	}
	public int getStorageSize() {
		return storageSize;
	}
	public void setStorageSize(int storageSize) {
		this.storageSize = storageSize;
	}
	
	public String getSpecs() {
		return storageType+" "+storageSize;
	}
}
