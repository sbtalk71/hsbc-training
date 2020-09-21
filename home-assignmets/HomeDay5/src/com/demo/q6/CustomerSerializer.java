package com.demo.q6;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


/**
 * 
 * @author Megha agarwal
 *Seializing customer object
 */
public class CustomerSerializer {

	public static void main(String[] args) throws IOException{
		
		FileOutputStream fos=new FileOutputStream("customer.ser");
		ObjectOutputStream dos=new ObjectOutputStream(fos);
		
		for(int i=1;i<=3;i++)
		{
			Customer cus=new Customer(100+i,"customer"+i,"city"+i);
			dos.writeObject(cus);
		}
		
		dos.close();
		
		System.out.println("Data saved successfully!!");
		
	}
}
