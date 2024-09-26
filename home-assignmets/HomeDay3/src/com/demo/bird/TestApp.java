package com.demo.bird;

public class TestApp {

	public static void main(String[] args) {
		Parrot p=new Parrot("Green","Trees");
		Eagle e=new Eagle("Brown","Planes");
		Duck d=new Duck("White","Pond");
		
		Bird b;
		
		b=e;
		System.out.println(b.getFood());
		
		b=p;
		System.out.println(b.getFood());
		
		b=d;
		System.out.println(b.getFood());
		

	}

}
