package com.demo.inheritance.demo3;

public class App {

	public static void printArea(Figure f) {
		System.out.println(f.area());
	}

	public static void main(String[] args) {

		Figure f1 = new Rectangle(10, 15);
		Figure f2 = new Triangle(10, 15);

		printArea(f1);
		printArea(f2);

		Figure f3;
		f3 = f1;
		printArea(f3);

		f3 = f2;
		printArea(f3);

	}
}
