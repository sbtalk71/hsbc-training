package com.hsbc.assgnmt.q2;

/**
 * 
 * @author Megha agarwal
 *Main class to test MyThread working with three threads 
 */
public class RunnableTest {
	
	public static void main(String[] args) throws InterruptedException{
		
		Thread t1=new Thread(new MyThread());
		Thread t2=new Thread(new MyThread());
		Thread t3=new Thread(new MyThread());
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		
		System.out.println("Task done!!");
	}

}
