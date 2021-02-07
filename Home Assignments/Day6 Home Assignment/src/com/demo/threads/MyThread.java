/**
 * 
 * @author Muskan Karnani 
 * This is to extend Thread class and override the run() method to implement the task
 *
 */
package com.demo.threads;

public class MyThread extends Thread {

	@Override
	public void run() {
		for(int i=0;i<20;i++)
		{
			System.out.println("This is the run() method of this thread with thread name as "+Thread.currentThread().getName());
		}
	}
}
