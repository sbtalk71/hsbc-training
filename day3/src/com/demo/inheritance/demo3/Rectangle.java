package com.demo.inheritance.demo3;

public class Rectangle extends Figure {

	@Override
	public double area() {
	
		return dim1*dim2;
	}

	public Rectangle(int dim1, int dim2) {
		super(dim1, dim2);
		// TODO Auto-generated constructor stub
	}
	

}
