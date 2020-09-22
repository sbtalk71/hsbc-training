package com.demo.threads;

public class ThreadMain1 {

	public static void main(String[] args) throws InterruptedException{
		System.out.println("Main Thread Starts...");
		//Thread.currentThread().setPriority(8);
		MyThread t1=new MyThread();
		MyThread t2=new MyThread();
		t1.start();
		t2.start();
		System.out.println(t1);
		System.out.println(Thread.currentThread());

		t1.join();
		t2.join();
		System.out.println("Main Thread Exits...");
	}

}
