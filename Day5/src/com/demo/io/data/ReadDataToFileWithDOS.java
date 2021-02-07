package com.demo.io.data;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadDataToFileWithDOS {

	public static void main(String[] args) throws Exception
	{
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		DataInputStream dis = null;
		try
		{
			fis = new FileInputStream("mydata.dat");
			bis = new BufferedInputStream(fis);
			dis = new DataInputStream(bis);
			while(true)
			{ int id = dis.readInt();
			String name = dis.readUTF();
			String loc = dis.readUTF();
			double sal = dis.readDouble();
			
			
			System.out.println(id+" "+name+" "+loc+" "+sal);
				
			}
		}
			catch(FileNotFoundException e)
			{
				System.out.print(e);
		}catch (EOFException e)
		{
			System.out.println(" Done");
		}catch(IOException e)
		{
			System.out.println(e);
		}	
	}

}
