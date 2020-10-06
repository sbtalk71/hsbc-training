package com.demo.features;

public class DemoThread {

	public static void main(String[] args) {
		
		Worker w= new Worker();
		
		Thread t1= new Thread(Worker::fun);
		t1.start();
		
		Thread t2=new Thread(()->System.out.println("Hello from "+Thread.currentThread().getName()));

		Runnable worker1=()->System.out.println("hello");
	}

}

class Worker implements Runnable{

	@Override
	public void run() {
		System.out.println("Hello from "+Thread.currentThread().getName());
		
	}
	
	
	public static void fun() {
		System.out.println("Hello from fun : "+Thread.currentThread().getName());
		
	}
	
}