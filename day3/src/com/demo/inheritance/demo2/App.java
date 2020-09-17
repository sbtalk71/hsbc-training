package com.demo.inheritance.demo2;

public class App {
public static void main(String[] args) {
	
	Person p=new Person(100,"Dev");
	
	Employee e=new Employee(100,"Roy",10000);
	
	System.out.println(p.getDetails());
	System.out.println(e.getDetails());
}
}
