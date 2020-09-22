package com.hsbc.assgnmt.q3;

/**
 * 
 * @author Megha Agarwal
 *
 */
public class AppTest {
	
	/**
	 * Whenever start method is called, a thread object of MyRunnable will be called to print 1-20 nos.
	 */
	public void start()  {
		Thread t1;
		try {
		t1=new Thread(new MyRunnable());
		t1.start();
		t1.join();
		}
		catch(InterruptedException ie) {
			System.out.println(ie);
		}
		
	}
	
	public static void main(String[] args) {
		AppTest at=new AppTest();
		at.start();
		
		System.out.println("Thread run completed!!");
											//call start method as many times required!!
		at.start();
	}

}
