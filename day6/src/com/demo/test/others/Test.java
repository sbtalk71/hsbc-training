package com.demo.test.others;

public class Test {

	class Inner1 {

		public void display() {
			System.out.println("from display()");

		}
	}

	static class Inner2 {

		public void fun() {
			System.out.println("from fun()");

		}

		public static void main(String[] args) {

		}

	}

	interface Fun {
		public void fun();

	}
}