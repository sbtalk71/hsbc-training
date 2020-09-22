package com.hsbc.assgnmt.q3;
/**
 * 
 * @author Megha agarwal
 *Class implementing Runnable interface
 */
public class MyRunnable implements Runnable{
	
	public void run() {
		for(int i=1;i<=20;i++)
			System.out.println(i);
	}

}
