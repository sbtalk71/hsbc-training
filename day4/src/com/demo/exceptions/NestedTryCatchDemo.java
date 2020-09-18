package com.demo.exceptions;

public class NestedTryCatchDemo {

	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 0;
			try {
				double d = a / b;
			} catch (NullPointerException e) {
				System.out.println("Inner catch : " + e);
			}
			
		} catch (ArithmeticException e) {
			System.out.println("Outer catch : " + e);
		}finally {
			System.out.println("Finally....");
		}

		System.out.println("App resumes normal execution");
	}
	
}
