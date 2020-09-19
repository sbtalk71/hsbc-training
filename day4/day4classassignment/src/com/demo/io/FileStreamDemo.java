package com.demo.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamDemo {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			File file = new File("f:\\temp\\io\\demo.txt");
			fis = new FileInputStream(file);
			fos = new FileOutputStream("demo.txt");

			int data = 0;
			while ((data = fis.read()) != -1) {
				System.out.println((char) data);
				fos.write(data);
			}

		} catch (FileNotFoundException e) {
			// TODO: handle exception
		} catch (IOException e) {
			// TODO: handle exception
		} finally {
			System.out.println("Finally");
		}
		try {
			if (fis != null || fos != null) {
				fis.close();
				fos.close();
			}
		} catch (IOException e) {
			// TODO: handle exception
		}

	}

}
