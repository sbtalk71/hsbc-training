/**
 * 
 * @author Muskan Karnani
 * Yes a constructor can throw an exception
 * and we can handle is by throwing the exception which transfers it to the catch block in the main method i.e. either throw or wrap it around try-catch block.
 *
 */
package com.demo;

public class ExceptionInConstructor {

		   public ExceptionInConstructor() throws InterruptedException {
		      System.out.println("Preparing an Object");
		      Thread.sleep(1000);
		      System.out.println("Object is ready");
		   }
		   public static void main(String args[]) {
		      try {
		         ExceptionInConstructor test = new ExceptionInConstructor();
		      } catch (InterruptedException e) {
		         System.out.println("Got interrupted...");
		      }
		   }
}
