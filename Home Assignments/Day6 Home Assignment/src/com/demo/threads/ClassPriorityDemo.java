/**
 * 
 * 
 * @author Muskan Karnani
 * To test the priority if threads when we set the new priority
 *
 */
package com.demo.threads;
public class ClassPriorityDemo {

	public static void main(String[] args) {
		ClassPriority1 t1 = new ClassPriority1();
		ClassPriority2 t2 = new ClassPriority2();
		ClassPriority3 t3 = new ClassPriority3();
		
		System.out.println("Priority of t1: "+t1.getPriority());
		System.out.println("Priority of t2: "+t2.getPriority());
		System.out.println("Priority of t3: "+t3.getPriority());

		t3.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(t2.getPriority() + 1);
		t1.setPriority(Thread.MIN_PRIORITY);

		System.out.println("Priority of t1: "+t1.getPriority());
		System.out.println("Priority of t2: "+t2.getPriority());
		System.out.println("Priority of t3: "+t3.getPriority());
		
		t1.start(); 
		t2.start();
		t3.start();
		System.out.println("... End of executuion ");
	}

}
