package com.demo.threads;

public class ThreadMain {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main Thread Starts");
		
		MyThread t =new MyThread();
		Thread.currentThread().setPriority(7);
		MyThread t1 =new MyThread();
		
		System.out.println(Thread.currentThread());
		t.start();
		t1.start();
		System.out.println(t);
		System.out.println(t1);
		t1.join();    
		t.join();
		
		System.out.println("Main Thread Ends");

	}

}
