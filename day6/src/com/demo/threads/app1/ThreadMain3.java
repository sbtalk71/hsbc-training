package com.demo.threads.app1;

public class ThreadMain3 {

	public static void main(String[] args) throws Exception{
		MessagePrinter printer=new MessagePrinter();
		
		Thread t1=new Thread(new PrintWorker(printer, "Hello"));
		Thread t2=new Thread(new PrintWorker(printer, "Good"));
		Thread t3=new Thread(new PrintWorker(printer, "World"));
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();

	
	}

}
