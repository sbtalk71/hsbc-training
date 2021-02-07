/**
 * 
 * @author Muskan Karnani 
 * This is to run three threads of MyThreadRunnable class and print a msg 20 times
 *
 */
package com.demo.threads;

public class MyThreadRunnableDemo {

	public static void main(String[] args)
	{
		MyThreadRunnable ob=new MyThreadRunnable();
		Thread t1=new Thread(ob);
		Thread t2=new Thread(ob);
		Thread t3=new Thread(ob);
		try {
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
		t3.join();
		}catch(InterruptedException e) {
		System.out.println(e);}
	}

}
