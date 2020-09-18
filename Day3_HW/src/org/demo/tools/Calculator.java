package org.demo.tools;

public class Calculator {
	private double a, b, result;

	public Calculator(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public double add() {
		return result = a + b;
	}

	public double substract() {
		if (a > b)
			result = a - b;
		else
			result = b - a;
		return result;
	}

	public double multiply() {
		return result = a * b;
	}

}
