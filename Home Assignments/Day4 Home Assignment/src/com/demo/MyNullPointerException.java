/**
 * 
 * @author Muskan Karnani
 *
 */
package com.demo;
import java.lang.NullPointerException;

public class MyNullPointerException extends NullPointerException
{
		public String toString() {
		return "Null Pointer Exception!!";
		// TODO Auto-generated constructor stub
	}
	public MyNullPointerException() {
		super();
	}
	public MyNullPointerException(String msg)
	{
		super();
		System.out.println(msg);
	}
	
	

}
