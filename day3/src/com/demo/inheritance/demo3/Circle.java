package com.demo.inheritance.demo3;

public class Circle extends Figure {

	public Circle(int dim2) {
		super(dim2);
	}

	@Override
	public double area() {

		System.out.println("Area of Circle = "+(3.14 * dim2 * dim2));
		return 3.14 * dim2 * dim2;
	}

}
