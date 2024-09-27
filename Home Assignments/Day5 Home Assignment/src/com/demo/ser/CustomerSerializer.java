/**
 * @author Muskan Karnani
 * This is to serialize the three customer objects 
 */

package com.demo.ser;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CustomerSerializer {

		public static void main(String[] args)throws IOException {
			FileOutputStream fos=new FileOutputStream("customer.ser");
			ObjectOutputStream objOut=new ObjectOutputStream(fos);
			for(int i=1;i<4;i++)
			{
			Customer obj=new Customer("100"+i, "Name"+i, "Hyd"+i);
			objOut.writeObject(obj);
			}
			objOut.close();
			
			System.out.println("Customer Serialized..");
		}
}
