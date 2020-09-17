package com.demo.inheritance.demo2;

public class App2 {

	public static void printDetails(Person p) {
		System.out.println(p.getDetails());
	}

	public static void main(String[] args) {

		Person p = new Person(100, "Dev");

		Employee e = new Employee(100, "Roy", 10000);

		System.out.println(p.getDetails());

		// p = e;

		System.out.println(p.getDetails());

		Object ob = p;

		System.out.println(ob.getClass().getName());
		System.out.println(e.toString());
		
	}

}
