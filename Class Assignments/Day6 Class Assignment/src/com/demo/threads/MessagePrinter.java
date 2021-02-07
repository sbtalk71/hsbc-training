package com.demo.threads;

public class MessagePrinter {
	public synchronized void  print(String msg)
	{
		//System.out.println(msg);
		System.out.print("["+msg);
		try {
			Thread.sleep(5000);
		}catch (InterruptedException e) {
		 System.out.println(e);
		}
		System.out.println("]");
	}
 
}
