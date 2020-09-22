package com.demo.threads;

public class ThreadMainWorker {

	public static void main(String[] args) throws InterruptedException{
		MessagePrinter printer=new MessagePrinter();//SHARED OBJECT BY ALL THE THREADS
	
		Thread t1=new Thread(new Worker(printer,"HELLO WORKER1 !!") );
		Thread t2=new Thread(new Worker(printer,"	GOOD !!") );
		Thread t3=new Thread(new Worker(printer," WORLD !!") );
		
		t1.start();
		t2.start();
		t3.start();
		//SEQUENCE CAN BE ANYTHING
		t1.join();
		t2.join();
		t3.join();
	}

}
