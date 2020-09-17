package com.demo.inheritance.bird;

public class MainApp {
	public static void main(String[] args) {
		Bird ref;

		Duck d = new Duck("White");
		Hen h = new Hen("Red");

		ref = d;
		System.out.println(ref.findcolor());

		ref = h;
		System.out.println(h.findcolor());
	}
}
