/**
 * 
 * @author Muskan Karnani 
 * This is to run three threads of MyThread class and print a msg 20 times
 *
 */
package com.demo.threads;
public class MyThreadDemo {

	public static void main(String[] args) {
		MyThread t1=new MyThread();
		MyThread t2=new MyThread();
		MyThread t3=new MyThread();
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
