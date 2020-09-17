package com.demo.inheritance.demo3;

public class Circle extends Figure {

	@Override
	public double area() {
    return dim2*3.14*dim2;
	}

	public Circle(int dim2) {
		super(dim2);
		// TODO Auto-generated constructor stub
	}

}
