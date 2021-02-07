package com.hsbc.assgnmt.q1;

/**
 * 
 * @author Megha agarwal
 *Main class to test MyThread working with three threads
 */
public class MainTest {
	
	public static void main(String[] args) throws InterruptedException{
		MyThread t1=new MyThread();
		MyThread t2=new MyThread();
		MyThread t3=new MyThread();
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		
		System.out.println("Task done!!");
	}

}
