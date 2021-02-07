package com.demo.threads;

public class SleepDemo2 implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<20;i++)
		{
			System.out.println("This is the run() method of this thread with thread name as "+Thread.currentThread().getName());
			try {
				Thread.sleep(5000);
			}catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
	}
}
