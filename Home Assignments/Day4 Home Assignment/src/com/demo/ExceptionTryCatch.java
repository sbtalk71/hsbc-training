/**
 * 
 * @author Muskan Karnani
 * No, it is not necessary that the exception has to be handled by the same try catch that throw it.
 * At first, it will search for the attached catch or all the number of catch blocks attached with the try block
 * But, if  it cannot handle then it can go to the outer catch if its a nested try-catch block
 */
package com.demo;
public class ExceptionTryCatch {
	public static void main(String[] args) {
		int i = 0;
		try{
			System.out.println("OUTER TRY BLOCK");
			try {
				System.out.println("INNER TRY BLOCK");
			i=Integer.parseInt("hi");
		}catch(ArithmeticException e) {
			System.out.println("Inner block 1:"+e);
		}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Inner block 1:"+e);
		}
		}catch(NumberFormatException e)
		{
			System.out.println("Outer block 1:"+e);
		}
		System.out.println(i);
		
		
	}
}
