package com.demo.inheritance.demo2;

public class App {

	public static void printDetails(Person p) {
		System.out.println(p.getDetails());
	}

	public static void main(String[] args) {
		Person p = new Person(101, "Shyam");
		Employee e = new Employee(102, "Ram", 44000);
		TrainingEmp t = new TrainingEmp(103, "Sita", 50000, "A+");

		System.out.println(p.getDetails());
		System.out.println(e.getDetails());
		System.out.println(t.getDetails());

		Person p2 = new Employee(104, "geeta", 8880);
		System.out.println(p2.getDetails());

		printDetails(t);

		Object o = t;
		System.out.println(o.getClass().getName());

		System.out.println(e);

	}

}
