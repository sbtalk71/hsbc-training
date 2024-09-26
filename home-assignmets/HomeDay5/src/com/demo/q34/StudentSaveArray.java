package com.demo.q34;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentSaveArray {
	
	public static void saveArray(Student[] studList) throws IOException{
		FileOutputStream fos=new FileOutputStream("student.dat",true);
		BufferedOutputStream  bos=new BufferedOutputStream(fos);
		DataOutputStream dos=new DataOutputStream(bos);
		
		//System.out.println(studList.length);
		
		for(int i=0;i<5;i++) {
			dos.writeInt(studList[i].getStudId());
			dos.writeUTF(studList[i].getName());
		}
		
		System.out.println("Data saved!!");
		
	}

	public static void main(String[] args) throws IOException {
		
		Student [] studList=new Student[10];
		for(int i=0;i<5;i++)
			studList[i]=new Student(10+i,"Student"+i);
		
		saveArray(studList);
	}
}
