package com.demo.io.ser;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import com.demo.io.entity.Emp;

public class MyEmpSerializer {

	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos=new FileOutputStream("emp.ser");
		ObjectOutputStream objOut=new ObjectOutputStream(fos);
		
		for(int i=1;i<11;i++) {
		Emp emp= new Emp(100+i, "Emp"+i, "City"+i, 6000+i);
		
		objOut.writeObject(emp);
		}
		objOut.close();
		
		System.out.println("Emp Serialized..");

	}

}
