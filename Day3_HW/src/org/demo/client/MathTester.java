package org.demo.client;

import org.demo.tools.Calculator;

public class MathTester {

	public static void main(String[] args) {
		Calculator c = new Calculator(5, 10);
		System.out.println(c.add());
		System.out.println(c.substract());
		System.out.println(c.multiply());
	}

}
