package com.demo.bird;

public class Duck extends Bird {
	
	public Duck(String color, String home) {
		super(color,home);
		
	}

	@Override
	public String getFood()
	{
		return "Duck eats fish";
	}
}
