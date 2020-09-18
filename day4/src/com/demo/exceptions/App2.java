package com.demo.exceptions;

public class App2 {

	public double divide(int a, int b) {
		double result = 0.0;
		try {
			result = a / b;
		} catch (ArithmeticException e) {
			//System.out.println(e);
			throw new RuntimeException(" SOmething Went Wrong!!");
		}
		return result;
	}
}
