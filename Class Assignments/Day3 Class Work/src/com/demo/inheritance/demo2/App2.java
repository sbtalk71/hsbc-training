package com.demo.inheritance.demo2;

public class App2 {

	public static void printDetails(Person p) //we can also use object class instead of Person but there will be complications
	{
		System.out.println(p.getDetails());
	}
	public static void main(String[] args) {
		Employee e=new Employee(101,"arb",256.25);
	//	Person p=new Person(101,"arb");
		System.out.println(e.getDetails());
		//System.out.println(p.getDetails());*/
		TraineeEmp emp=new TraineeEmp(102,"äbyd",256353,"good");
		System.out.println(emp.getDetails());
		Person p=new Employee(101,"arb",256.25);
		System.out.println(p.getDetails());
		printDetails(emp);
		Person p1=e;
		Object o=p1;
		//to know the actual class of object, we use reflection
		System.out.println(o.getClass().getName());
		System.out.println(e); //calls Object.toString() method which we can also override in Employee class to  get some manipulated answer 
	}

}
