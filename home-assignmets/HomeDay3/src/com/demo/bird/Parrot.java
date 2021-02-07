package com.demo.bird;

public class Parrot extends Bird {
	
	public Parrot(String color, String home) {
		super(color,home);
	}
	
	@Override
	public String getFood() {
		
		return "Parrot is herbivore";
		
	}
	


}
