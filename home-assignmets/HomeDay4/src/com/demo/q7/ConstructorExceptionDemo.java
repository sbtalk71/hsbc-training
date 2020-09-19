package com.demo.q7;

/**
 * 
 * @author Megha agarwal
 *this class constructor throw a runtime exception
 */
public class ConstructorExceptionDemo {
	
	public ConstructorExceptionDemo() {
		
		throw new RuntimeException("Constructor throwing exception");
	}
	
	public void display() {
		System.out.println("Hii..experimenting with exceptions!!");
	}

}
