package com.demo.inheritance.demo3;

public class Triangle extends Figure {
	private double a;

	public Triangle(int dim1, int dim2) {
		super(dim1, dim2);
	}

	@Override
	public double area() {
		a = (dim1 * dim2) / 2;
		return a;

	}

}
