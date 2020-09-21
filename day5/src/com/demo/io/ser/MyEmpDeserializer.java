package com.demo.io.ser;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.demo.io.entity.Emp;

public class MyEmpDeserializer {

	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream("emp2.ser");
		ObjectInputStream objIn = new ObjectInputStream(fis);

		try {
			while (true) {
				Emp e = (Emp) objIn.readObject();

				// Object obj = objIn.readObject();
				// Emp e = (Emp) obj;
				System.out.println(e.getEmpId() + " " + e.getName());
			}
		} catch (EOFException e) {
			e.printStackTrace();
			//System.out.println("Done....");
		}
		objIn.close();

	}

}
