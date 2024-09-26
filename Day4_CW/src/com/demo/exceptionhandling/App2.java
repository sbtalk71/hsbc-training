package com.demo.exceptionhandling;

public class App2 {
	int result;

	public int divide(int a, int b) {
		try {
			result = a / b;
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println(e);
			// e.printStackTrace();
			throw e;
		}
		return result;

	}

}
