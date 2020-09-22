package com.demo.threads;

public class SleepDemo {

	public static void main(String[] args) {
		try {
	SleepDemo1 sdt1=new SleepDemo1();
	sdt1.start();
	sdt1.join();
	SleepDemo2 sdt2=new SleepDemo2();
	Thread t1=new Thread(sdt2);
	t1.start();
	t1.join();
		}catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}

}
