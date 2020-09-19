/**
 * @author Muskan Karnani
 * Yes, there can be a try block without catch by using finally
 */

package com.demo;

public class TryWithOnlyFinally {
	public static void main(String[] args) {
		
	int i=0;
	try {
		i=Integer.parseInt("1k");
	}
	finally{
		System.out.println("Start of program");
	}
	System.out.println(i);
	}

}
