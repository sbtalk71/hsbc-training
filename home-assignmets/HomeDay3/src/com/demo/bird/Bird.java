package com.demo.bird;

/**
 * 
 * @author hp
 *Abstract class behaviour demo
 */
public abstract class Bird {
	
	protected String color;
	protected String home;								
	
	public Bird(String color, String home)
	{
		this.color=color;
		this.home=home;
	}
	
	public abstract String getFood();
	
}