package com.demo.threads;

public class ThreadMain1 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main thread starts");

		MyThread t1=new MyThread();
		t1.start();
		//t1.join(); //so that main waits for thread to complete first because then the main will dead before thread so the result will be useless and the thread will be called as orphan thread 
		MyThread t2=new MyThread();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Main thread ends");

	}

}
