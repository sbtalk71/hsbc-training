   package com.demo.io.data;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class WriteDataToFileWithDOS {
	
	public static void main(String[] args) throws Exception
	{
		FileOutputStream fos = new FileOutputStream("mydata.dat");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		DataOutputStream dos = new DataOutputStream (bos);
		
		dos.writeInt(1);
		dos.writeUTF("Supriya ");
		dos.writeUTF("Singrauli");
		dos.writeDouble(45000);
		
		
		dos.writeInt(2);
		dos.writeUTF("Shailja ");
		dos.writeUTF("Lucknow");
		dos.writeDouble(45000);
		
		dos.writeInt(3);
		dos.writeUTF("Srishti ");
		dos.writeUTF("Jaipur");
		dos.writeDouble(45000);
		
		dos.close();
		
	}

}
