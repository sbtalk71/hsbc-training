package com.demo.bird;

public class Eagle extends Bird {
	
	public Eagle(String color, String home)
	{
		super(color, home);
	}

	public String getFood()
	{
		return "Eagle is carnivore";
	}
}
