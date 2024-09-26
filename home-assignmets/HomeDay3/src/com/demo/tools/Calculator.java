package com.demo.tools;

/**
 * 
 * @author Megha Agarwal
 * Creating class in this packaga and methods will be access in class from another package
 *
 */
public class Calculator {
	
	private int num1,num2;
	
	public Calculator(int num1,int num2)
	{
		this.num1=num1;
		this.num2=num2;
	}
	
	public int add()
	{
		return num1+num2;
	}
	
	public int subtract()
	{
		return num1-num2;
	}
	
	public int multiply()
	{
		return num1*num2;
	}

}
