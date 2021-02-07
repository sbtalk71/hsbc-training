package com.demo.threads;

public class MyThread extends Thread {
	@Override
	public void run() {
		try {
			for(int i=0;i<20;i++) {
				
				System.out.println("Iteration no : "+i+" name is "+Thread.currentThread().getName());
				Thread.sleep(2000);
			}
		}catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
}
