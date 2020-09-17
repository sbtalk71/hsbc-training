package com.demo.inheritance.demo3;

public class Square extends Figure {

	@Override
	public double area() {
		System.out.println(dim1 * dim2);
		return (dim1 * dim2);

	}

	public Square(int dim1, int dim2) {
		super(dim1, dim2);
		// TODO Auto-generated constructor stub
	}
}
