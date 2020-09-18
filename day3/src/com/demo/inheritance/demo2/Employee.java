package com.demo.inheritance.demo2;

public class Employee extends Person {

	private double salary;

	public Employee(int id, String name, double salary) {
		super(id, name);
		this.salary = salary;
	}

	@Override
	public String getDetails() {
		return super.getDetails() + " " + salary;
	}

	public void fun() {
		System.out.println("this is fun..");
	}
	
	@Override
	public String toString() {
		
		return "This is "+this.getClass().getSimpleName();
	}
}
