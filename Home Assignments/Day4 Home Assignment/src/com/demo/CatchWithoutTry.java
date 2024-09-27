/**
 * @author Muskan Karnani
 * No, it is not possible to have a catch block without a try block 
 * because then the catch block would be useless as there is no piece of code to throw an exception.
 */

package com.demo;

public class CatchWithoutTry {
	public static void main(String[] args)
	{
		int value=0;
		String text="10";
	try{ 
		//Code that can fail if text is not a number
		value = Integer.parseInt(text); 
	}catch(Exception e){ 
		//this code gets executed when the code in the try block fails 
		e.printStackTrace();
	} 
	System.out.println(value);
	}
}
