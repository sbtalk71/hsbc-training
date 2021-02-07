package com.demo.q34;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class StudentRetrieveArray {
	
	public static void main(String args[]) throws IOException,ClassNotFoundException{
		FileInputStream fis=new FileInputStream("student.dat");
		BufferedInputStream br=new BufferedInputStream(fis);
		DataInputStream dis=new DataInputStream(br);
		Student[] studList=new Student[10];
		int i=0;
		try {
			while(true) {
				int id=dis.readInt();
				String name=dis.readUTF();
				
				System.out.println(id+" "+name);
				studList[i]=new Student(id,name);
				i+=1;
			}
		}catch(EOFException eo) {
			System.out.println("Done reading!!");
		}
		
		dis.close();
	}

}
