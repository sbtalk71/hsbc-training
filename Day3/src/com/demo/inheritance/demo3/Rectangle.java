package com.demo.inheritance.demo3;

public class Rectangle extends Figure {
	private double a;

	public Rectangle(int dim1, int dim2) {
		super(dim1, dim2);
	}

	@Override
	public double area() {
		a = dim1 * dim2;
		return a;

	}

}
