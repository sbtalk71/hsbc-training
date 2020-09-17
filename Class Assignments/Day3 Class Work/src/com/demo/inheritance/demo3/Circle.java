package com.demo.inheritance.demo3;

public class Circle extends Figure {

	public Circle(int dim2)
	{
		super(dim2);
	}
	public double area()
	{
		System.out.println(3.14*dim2*dim2);
		return (3.14*dim2*dim2);
	}
	/*public static void main(String[] args) {
		Circle r=new Circle(7);
		System.out.println(r.area());
	}*/ 
}
