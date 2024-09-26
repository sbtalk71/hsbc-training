package com.hsbc.assgnmt.q2;
/**
 * 
 * @author Megha agarwal
 * Class implementing runnable interface to create custom threads
 *
 */
public class MyThread implements Runnable{
	
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Hii this is :"+Thread.currentThread().getName()+" "+i);
			
		}
	}

}
