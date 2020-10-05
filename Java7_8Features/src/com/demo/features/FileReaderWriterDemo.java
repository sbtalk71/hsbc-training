package com.demo.features;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {

	public static void main(String[] args) {

		File file = new File("d:\\temp\\io\\demo.txt");

		try (FileReader fis = new FileReader(file);
				FileWriter fos = new FileWriter("demo_1.txt", true);
				BufferedReader bis = new BufferedReader(fis);
				BufferedWriter bos = new BufferedWriter(fos);) {

			int data = 0;
			while ((data = bis.read()) != -1) {

				System.out.print((char) data);
				bos.write(data);
				// bos.flush();
			}
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found..");
		} catch (IOException e) {
			System.out.println(e);
		}

		System.out.println("End of task..");
	}

}
