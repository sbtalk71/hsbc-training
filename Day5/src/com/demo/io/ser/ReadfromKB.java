package com.demo.io.ser;

import java.io.BufferedReader;
 
import java.io.InputStreamReader;

public class ReadfromKB {

	public static void main(String[  ] args) throws Exception {
		 InputStreamReader isr = new InputStreamReader(System.in);
		 BufferedReader br = new BufferedReader(isr);
		 
		 String line="";
		 System.out.println("Enter Exit to end.....");
		 while(!(line =br.readLine()).equals("Exit"))
		 {
			 System.out.println(line);
		 }
		 	
		 

	}

}
