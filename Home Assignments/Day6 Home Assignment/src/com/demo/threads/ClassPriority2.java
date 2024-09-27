package com.demo.threads;

public class ClassPriority2 extends Thread{

	@Override
	public void run() {
		System.out.println("Start Thread 2 ....");
		for(int i = 1; i <= 5; i++) {
			System.out.println("From Thread 2: i = "+ i);
		}
		System.out.println("... Exit Thread 2");
	}

}
