package com.demo.inheritance.bird;

public class Duck extends Bird {

	@Override
	public String findcolor() {
		return color;
	}

	public Duck(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

}
