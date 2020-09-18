package com.demo.app.entity;

public class Emp {
	int id;
	String name;

	public Emp(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return id + " " + name;
	}

}
