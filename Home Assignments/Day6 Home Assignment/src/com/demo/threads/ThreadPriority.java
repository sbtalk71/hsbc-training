/**
 * 
 * @author Muskan Karnani
 * This is to show what the getPriority() and setPriority() methods does.
 * Then, setting the current thread priority to see that child priority is same as current thread priority.
 *
 */
package com.demo.threads;

public class ThreadPriority  extends Thread{
	 @Override
	 public void run() 
	 { 
	     System.out.println("Inside run method"); 
	 } 

	 public static void main(String[]args) 
	 { 
	     ThreadPriority t1 = new ThreadPriority(); 
	     ThreadPriority t2 = new ThreadPriority(); 
	     ThreadPriority t3 = new ThreadPriority(); 

	     System.out.println("t1 thread priority : " +t1.getPriority()); // Default Priority 5 
	     System.out.println("t2 thread priority : " +t2.getPriority()); // Default Priority 5 
	     System.out.println("t3 thread priority : " +t3.getPriority()); // Default Priority 5 
	     t1.setPriority(7); 
	     t2.setPriority(2); 
	     t3.setPriority(5); 
	     System.out.println("t1 thread priority : " + t1.getPriority()); 
	     System.out.println("t2 thread priority : " + t2.getPriority()); 
	     System.out.println("t3 thread priority : " + t3.getPriority());
	     
	     System.out.print(Thread.currentThread().getName()); 
	     System.out.println("Main thread priority : "+ Thread.currentThread().getPriority()); 

	     Thread.currentThread().setPriority(10); 
	     System.out.println("Main thread priority : "+ Thread.currentThread().getPriority()); 
	     ThreadPriority t4 = new ThreadPriority(); 
	     System.out.println("t4 thread priority : " +t4.getPriority());
	 } 

} 


