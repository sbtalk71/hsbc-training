package com.demo.q6;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


/**
 * 
 * @author Megha agarwal
 * DEserializing customer object class
 *
 */
public class CustomerDeserializer {

	public static void main(String[] args) throws IOException,ClassNotFoundException{
		
		try {
			FileInputStream fis=new FileInputStream("customer.ser");
			ObjectInputStream objInput=new ObjectInputStream(fis);
			while(true) {
				Customer cus=(Customer)objInput.readObject();
				System.out.println(cus.getCustomerId()+" "+cus.getName()+" "+cus.getAddress());
			}
		}
		catch(EOFException eo) {
			System.out.println("Done reading..");
		}
		
		
	}
}
