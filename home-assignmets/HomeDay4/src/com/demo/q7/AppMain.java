package com.demo.q7;

/**
 * 
 * @author Megha Agarwal
 *the exception thrown by constructor is caught in main. 
 *The method ce.display does not execute.Because the object cannot be created.
 */
public class AppMain {
	
	public static void main(String args[])
	{
		try {
			
			ConstructorExceptionDemo ce=new ConstructorExceptionDemo();
			ce.display();
		}
		catch(RuntimeException e)
		{
			System.out.println(e);
		}

		
		System.out.println("Program run successfully!!");
		
		
	}

}
