/**
 * 
 * @author  Muskan Karnani
 * It is really not possible to catch all the exception that the statement can throw,
 * so we should add all the exception in catch that may come according to us
 * and in the end we should attach a catch block for all the exceptions using the Exception class
 * Like in this example, we know there might be a NumberFormatException so we added a catch block with it.
 * If we didnot add it, the error will be caught by Exception catch block, as Exception is the super classes for all the exception that can occur.
 *
 */
package com.demo;
public class CatchAllException {
	public static void main(String[] args) {
	int i=0;
	try {
		i=Integer.parseInt("g");
	}catch(ArithmeticException e )
	{
		e.printStackTrace();
	}catch(NullPointerException e)
	{
		System.out.println(e);
	}catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e);
	}catch(Exception e)
	{
		System.out.println(e);
	}
	
	}
}
