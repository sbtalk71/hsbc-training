package com.demo.exceptionhandling;

public class App1 {
	int result;

	public int calculate(int a, int b) {
		App2 ap = new App2();
		try {
			result = ap.divide(a, b);

		} catch (ArithmeticException e) {
			System.out.println("divide by zero");
			// e.printStackTrace();
			throw e;
		}
		return result;

	}
}
