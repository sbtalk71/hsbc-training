package org.demo.tools;

public class Calculator 
{
	double a,b;
	public Calculator(double a, double b)
	{
		this.a=a;
		this.b=b;
	}
	public void add()
	{
		System.out.println("ADD RESULT : "+(a+b));
	}
	public void subtract()
	{
		System.out.println("SUBTRACT RESULT : "+(a-b));
	}
	public void multiply()
	{
		System.out.println("MULTIPLICATION RESULT : "+(a*b));
	}
	

}
