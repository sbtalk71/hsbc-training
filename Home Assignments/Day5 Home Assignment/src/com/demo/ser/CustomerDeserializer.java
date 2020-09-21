/**
 * @author Muskan Karnani
 * This is to deserialize the three customer objects and print them. 
 */
package com.demo.ser;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class CustomerDeserializer {
	
	public static void main(String[] args) throws Exception{
		
		FileInputStream fis=new FileInputStream("customer.ser");
		ObjectInputStream objIn=new ObjectInputStream(fis);
		try {
		while(true)
		{
		Object obj=objIn.readObject();
		Customer cust=(Customer)obj;
		System.out.println(cust.getCustomertId()+" "+cust.getName()+" "+cust.getAddress());
		}
		}catch(EOFException e)
		{
			System.out.println("DONE SUCCESSFULLY...");
		}
		objIn.close();
	}

}
