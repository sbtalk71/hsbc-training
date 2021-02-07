package com.demo.threads;

public class ClassPriority3 extends Thread{

	@Override
	public void run() {
		System.out.println("Start Thread 3....");
		for(int i = 1; i <= 5; i++) {
			System.out.println("From Thread 3: i = "+ i);
		}
		System.out.println("... Exit Thread 3");
	}

}
