/**
 * @author Muskan Karnani
 * To print table of the number passed in a synchronized block
 */
package com.demo.synchronize;
public class Table{  
	  
	 void printTable(int n){  
	   synchronized(this){
		   //synchronized block  
	     for(int i=1;i<=5;i++){  
	      System.out.println(n*i);  
	      try{  
	       Thread.sleep(400);  
	      }catch(Exception e)
	      {System.out.println(e);}  
	     }  
	   }  
	 }//end of the method  
}  