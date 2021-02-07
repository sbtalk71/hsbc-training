package com.demo.io.entity;

import java.io.Serializable;

public class Emp implements Serializable {
	int id;
	String name;
	String loc;
	double sal;

	public Emp() {
	}

	public Emp(int id, String name, String loc, double sal) {
		this.id = id;
		this.name = name;
		this.loc = loc;
		this.sal = sal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

}
