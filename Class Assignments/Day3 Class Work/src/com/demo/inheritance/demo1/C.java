package com.demo.inheritance.demo1;

public class C extends B{
	public C()
	{
		super("");//we neeed to pass something to call the parameterized constructor but it cannot call the default unless it is already defined explicitly
		System.out.println("C's Contructor");
	}

}
