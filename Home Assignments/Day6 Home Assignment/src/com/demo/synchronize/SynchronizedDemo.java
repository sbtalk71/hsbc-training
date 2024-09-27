/**
 * @author Muskan Karnani
 * this is to create threads of two classes MyThread1 and MyThread2 
 * and then pass the Table object and call the printTable() method.from respective run() method. 
 * Basically, a synchronized block can be used to lock an object for any shared resource.
 */


package com.demo.synchronize;

public class SynchronizedDemo {

	public static void main(String args[]){  
		Table obj = new Table();//only one object  
		MyThread1 t1=new MyThread1(obj);  
		MyThread2 t2=new MyThread2(obj);  
		t1.start();  
		t2.start();  
		}  
	
}

	