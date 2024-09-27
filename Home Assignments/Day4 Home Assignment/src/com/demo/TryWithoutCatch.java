/**
 * @author Muskan Karnani
 * Yes, we can have a try without catch block by using finally block.
 * We can use try with finally.Since finally block always executes even if there is an exception or not.
 */

package com.demo;

public class TryWithoutCatch {
	 
	 public static void main(String args[])
	 {
	  try
	  {
	   System.out.println("Executing try block"); 
	  }
	  finally
	  {
	   System.out.println("Executing finally block"); 
	  }
	 }
	}