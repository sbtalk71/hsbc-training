package com.demo.exceptions;

public class Main {

	public static void main(String[] args) {
		App2 app2 = new App2();
		App1 app1 = new App1(app2);
		double result = app1.calculate(2, 0);

		System.out.println("result = " + result);
		System.out.println("Done Successfully");

	}

}
