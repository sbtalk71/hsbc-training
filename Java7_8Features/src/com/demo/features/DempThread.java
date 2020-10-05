package com.demo.features;

public class DempThread {

	public static void main(String[] args) {
		
		Worker w= new Worker();
		
		Thread t1= new Thread(w);
		
		Thread t2=new Thread(()->System.out.println("Hello from "+Thread.currentThread().getName()));

		Runnable worker1=()->System.out.println("hello");
	}

}

class Worker implements Runnable{

	@Override
	public void run() {
		System.out.println("Hello from "+Thread.currentThread().getName());
		
	}
	
}