package com.demo.io.data;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadDatafromFileWithDIS {

	public static void main(String[] args) {
		FileInputStream fis = null;// new FileInputStream("mydata.dat");
		BufferedInputStream bis = null;// new BufferedInputStream(fis);

		DataInputStream dis = null;// new DataInputStream(bis);

		try {
			fis = new FileInputStream("mydata.dat");
			bis = new BufferedInputStream(fis);
			dis = new DataInputStream(bis);
			while (true) {
				int id = dis.readInt();
				String name = dis.readUTF();
				String city = dis.readUTF();
				double sal = dis.readDouble();
				System.out.println(id + " " + name + " " + city + " " + sal);
			}
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (EOFException e) {
			System.out.println("Done reading..");
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
