/**
 * 
 * @author Muskan Karnani
 * When we use join() method with a thread, then no other thread will run until the thread running complete its run() method, i.e. 
 * even if t1 thread sleeps for 5 seconds, but thread t2 will not run until thread t1 completes its task and dies.
 *
 */
package com.demo.threads;


public class JoinDemo extends Thread{

	

	@Override
	public void run() {
		try {
		System.out.println("I am thread "+Thread.currentThread().getName());
		for(int i=1;i<5;i++) {
			System.out.println(i);
			Thread.sleep(50);
			}
		}catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args)  {
		try {
		JoinDemo t1=new JoinDemo();
		JoinDemo t2=new JoinDemo();
		JoinDemo t3=new JoinDemo();
		System.out.println("Without Using join() method :");
		t1.start();
		t2.start();
		t3.start();
		t1.join();
		t2.join();
		t3.join();
		
		System.out.println("When we use join() method :");
		t1=new JoinDemo();
		t2=new JoinDemo();
		t3=new JoinDemo();
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
		t3.join();
		}catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}

}
