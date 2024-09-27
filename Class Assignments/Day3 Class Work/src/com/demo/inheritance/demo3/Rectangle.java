package com.demo.inheritance.demo3;

public class Rectangle extends Figure{

	public Rectangle(int dim1,int dim2) {
		super(dim1, dim2);
	}

	@Override
	public double area() {
		System.out.println(dim1*dim2);
		return dim1*dim2;
	}
	/*public static void main(String[] args) {
		Rectangle r=new Rectangle(2,4);
		System.out.println(r.area());
	}*/

}
