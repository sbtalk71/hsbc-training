package com.demo.io.ser;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import com.demo.io.entity.Emp;

public class MyEmpSerializer {

	public static void main(String[] args) throws Exception {
		FileOutputStream fout = new FileOutputStream("emp.ser");
		ObjectOutputStream obj = new ObjectOutputStream(fout);

		Emp emp = new Emp(100, "Scott", "india", 50000);

		obj.writeObject(emp);
		obj.close();

		System.out.println("Emp Serialized");

	}

}
