package com.demo.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamDemo {
	public static void main(String[] args) {
		File file = new File("e:\\temp\\io\\demo.txt");
		FileOutputStream fos = null;
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			fos = new FileOutputStream("demo1.txt");
			int data = 0;
			while ((data = fis.read()) != -1) {
				System.out.print((char) data);
				fos.write(data);

			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			try {
				if (fis != null || fos != null) {
					fis.close();
					fos.close();
				}
			} catch (IOException e) {
				System.out.println("Files could not be closed");
			}
		}
	}
}
