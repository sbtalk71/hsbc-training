package com.demo.inheritance.demo3;

public class MainApp {

	public static void main(String[] args) {
		Figure ref;

		Square s = new Square(10, 20);
		Rectangle r = new Rectangle(3, 4);
		Circle c = new Circle(5);

		ref = s;
		ref.area();

		ref = r;
		System.out.println(ref.area());

		ref = c;
		System.out.println(ref.area());

	}
}
