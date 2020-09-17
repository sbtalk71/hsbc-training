package com.demo.inheritance.demo3;

public class Triangle extends Figure {

	public Triangle(int dim1,int dim2)
	{
		super(dim1, dim2);
	}
	@Override
	public double area() {
		System.out.println((dim1*dim2)/2);
		return (dim1*dim2)/2;
	}
	/*
public static void main(String[] args) {
	Triangle t=new Triangle(2,4);
	System.out.println(t.area());
	t.fun();*/
}
 

