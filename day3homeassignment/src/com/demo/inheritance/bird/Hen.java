package com.demo.inheritance.bird;

public class Hen extends Bird {

	@Override
	public String findcolor() {
		return color;
	}

	public Hen(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

}
