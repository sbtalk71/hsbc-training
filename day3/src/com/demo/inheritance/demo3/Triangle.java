package com.demo.inheritance.demo3;

public class Triangle extends Figure {

	
	public Triangle(int dim1, int dim2) {
		super(dim1, dim2);

	}

	@Override
	public double area() {
		System.out.println("Area of Traingle = "+(dim1*dim2)/2);
		return (dim1*dim2)/2;
	}

}
