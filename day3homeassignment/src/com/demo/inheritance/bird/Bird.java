package com.demo.inheritance.bird;

public abstract class Bird {

	protected String color;

	public Bird(String color) {
		this.color = color;
	}

	abstract public String findcolor();
}
