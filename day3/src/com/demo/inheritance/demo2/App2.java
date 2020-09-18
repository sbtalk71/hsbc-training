package com.demo.inheritance.demo2;

public class App2 {

	public static void printDetails(Person p) {
		System.out.println(p.getDetails());
	}
	public static void main(String[] args) {
		
		Person p=new Person(100, "Shantanu");
		
		Employee e=new Employee(102, "Arun", 45000);
		
		System.out.println(p.getDetails());
		
	Person p2= new Employee(103, "Scott", 89000);
	
	//System.out.println(p2.getDetails());
	TraineeEmp t= new TraineeEmp(104, "Champak", 56000, "good");
	
	printDetails(t);
	
	
	Person p1=e;
	Object o=p;
	System.out.println(p1.getClass().getName());
	
	
	System.out.println(e.toString());

	}

}
