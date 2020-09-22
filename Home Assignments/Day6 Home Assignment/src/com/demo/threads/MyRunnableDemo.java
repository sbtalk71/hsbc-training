/**
 * @author Muskan Karnani
 * This is to run the MyRunnable class and the start method works only when start() method of MyRunnable class is called
 */

package com.demo.threads;

public class MyRunnableDemo {

	public static void main(String[] args) {
		MyRunnable ob=new MyRunnable();
		Thread t1=new Thread(ob);
		ob.start(t1);
	}

}
