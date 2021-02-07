package com.demo.threads;

public class ClassPriority1 extends Thread{

	@Override
	public void run() {
		System.out.println("Start Thread 1 ....");
		for(int i = 1; i <= 5; i++) {
			System.out.println("From Thread 1: i = "+ i);
		}
		System.out.println("... Exit Thread 1");
	}

}
