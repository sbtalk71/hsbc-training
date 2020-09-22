package com.demo.threads;

public class MyThread extends Thread {

	@Override
	public void run() {
		try {
			for (int i = 0; i < 20; i++) {
				System.out.println(Thread.currentThread().getName()+": " + i);
				Thread.sleep(2000);
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
