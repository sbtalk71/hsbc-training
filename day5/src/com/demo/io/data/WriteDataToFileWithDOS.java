package com.demo.io.data;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class WriteDataToFileWithDOS {

	public static void main(String[] args) throws Exception {

		FileOutputStream fos = new FileOutputStream("mydata.dat", true);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		DataOutputStream dos = new DataOutputStream(bos);

		dos.writeInt(100);
		dos.writeUTF("Shantanu");
		dos.writeUTF("Hyderabad");
		dos.writeDouble(56000.0);

		dos.close();

	}

}
