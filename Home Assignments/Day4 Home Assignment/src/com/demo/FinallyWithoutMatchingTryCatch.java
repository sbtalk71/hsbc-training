/**
 * 
 * @author Muskan Karnani
 * No, there cannot be a finally block without a matching try-catch block because the code in finally block will execute only when try block is executed
 * This means that we can have finally only when try block is there; catch block is not necessary
 *
 */
package com.demo;
public class FinallyWithoutMatchingTryCatch {
	public static void main(String[] args) {
		int i=0;
		/*finally{
			System.out.println("Start of program");
		}*/
		try {
			i=Integer.parseInt("10");
		}catch(Exception e) {
		System.out.println(e);
		}
		finally{
			System.out.println("Start of program");
		}
		System.out.println(i);
	}

}
