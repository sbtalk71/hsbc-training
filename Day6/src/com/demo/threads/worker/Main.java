package com.demo.threads.worker;

public class Main {

	public static void main(String[] args) throws Exception {
		MessagePrinter mp =new MessagePrinter();
		Thread w1 = new Thread( new Worker(mp,"hello"));
		Thread w2 = new Thread(new Worker(mp,"good morning"));
		Thread w3 = new Thread(new Worker(mp,"Thread class"));

		//w1.run();
		//w2.run();
	   // w3.run();
	    
	   w1.start();
	    w2.start();
	    w3.start();
	    
	    w1.join();
	    w2.join();
	   w3.join();
	    
		

	}

}
