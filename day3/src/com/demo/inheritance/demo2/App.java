package com.demo.inheritance.demo2;

public class App {

	public static void main(String[] args) {
		
		Person p=new Person(100, "Shantanu");
		
		Employee e=new Employee(102, "Arun", 45000);
		
		System.out.println(p.getDetails());
		System.out.println(e.getDetails());

	}

}
