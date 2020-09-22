package com.demo.threads.app1;

public class MessagePrinter {

	public synchronized void print(String message) {
		System.out.print("["+message);
		try {
			Thread.sleep(35000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("]");
	}
}
