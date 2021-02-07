/**
 * @author Muskan Karnani
 * This is to override the run() method of Runnable interface and creating a start() method which in turn will 
 * call the start() method of the Thread class. 
*/
package com.demo.threads;

public class MyRunnable implements Runnable{
	

@Override
	public void run() {
	for(int i=1;i<=20;i++)
		System.out.print(i+" ");
	System.out.println();
	}


public void start(Thread t)
{
	//System.out.println("hello thread");
	t.start();
}
}
