package com.demo.threads;

public class ThreadMain2 {

	public static void main(String[] args) throws InterruptedException{
		System.out.println("Main Thread Starts...");
		Worker worker1=new Worker();
		Thread t1= new Thread(worker1);
		t1.start();
		
		t1.join();
		System.out.println("Main Thread Exits...");
	}

}
