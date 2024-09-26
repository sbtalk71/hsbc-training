package com.demo.io.ser;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.demo.io.entity.Emp;

public class MyEmpDeserializer {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("emp.ser");
		ObjectInputStream objIn = new ObjectInputStream(fis);

		Object obj = objIn.readObject();
		System.out.println(obj.getClass());
		

		Emp e = (Emp) obj;
		System.out.println("id   " + e.getId()+" name"+ e.getName());
		objIn.close();
	}            
	

}
