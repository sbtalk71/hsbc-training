package com.demo.threads.worker;

public class MessagePrinter {

	public synchronized void  print(String message)

	{
		System.out.print("[ "+message);
		try {
			Thread.sleep(500);
		}catch(InterruptedException e) {
		System.out.println(e);
	}
		System.out.print(" ]\n");
	}

}
  