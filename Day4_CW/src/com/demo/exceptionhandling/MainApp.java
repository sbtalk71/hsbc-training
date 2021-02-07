package com.demo.exceptionhandling;

public class MainApp {

	public static void main(String[] args) {

		App1 a2 = new App1();
		try {
			System.out.println(a2.calculate(5, 0));
		} catch (ArithmeticException e) {
			 //e.printStackTrace();
			System.out.println("Arithmetic Exception Occured");

		}catch (NullPointerException e) {
			 //e.printStackTrace();
			System.out.println("Null Pointer Exception Occured");

		}
		catch(Exception e) {
			System.out.println(" Exception Occured");
		}
		System.out.println("done successfully");
		
	}

}
