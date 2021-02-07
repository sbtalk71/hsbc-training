package com.demo.threads.worker;

public class Worker implements Runnable {
	private String message;
	private MessagePrinter mp ;

	public Worker( MessagePrinter mp,String message) {
		this.message = message;
		this.mp=mp;
	}

	@Override
	public void run() {
		
		mp.print(message);
	}

}
