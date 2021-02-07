package org.demo.client;

import com.demo.tools.Calculator;

/**
 * 
 * @author Megha Agarwal
 *If any method of calculator class is not public, it cannot be accessed from this class
 */
public class MathTester {
	
	public static void main(String[] args)
	{
		Calculator c1=new Calculator(40,60);
		
		System.out.println("Additiion result: "+c1.add());		
			
		
		System.out.println("Subtraction result: "+c1.subtract());
		
		
		System.out.println("Multiplication result: "+c1.multiply());
	
		
		
	}

}
