package com.hsbc.assgnmt.q1;


/**
 * 
 * @author Megha agarwal
 *Class extending Thread class
 */
public class MyThread extends Thread{
	
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Hii this is :"+Thread.currentThread().getName()+" "+i);
			
		}
	}

}
