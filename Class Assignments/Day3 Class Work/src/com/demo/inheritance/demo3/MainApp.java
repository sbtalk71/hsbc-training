package com.demo.inheritance.demo3;

public class MainApp {

	public static void main(String[] args) {
		Figure ref;
		Triangle t=new Triangle(5,8);
		Rectangle r=new Rectangle(6,8);
		Circle c=new Circle(21);
		
		ref=t;
		ref.area();
		
		ref=r;
		ref.area();
		
		ref=c;
		ref.area();
	}
}
