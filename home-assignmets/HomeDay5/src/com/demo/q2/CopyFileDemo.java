package com.demo.q2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CopyFileDemo {

	public static void copyText(String srcFile, String destFile) {
		try {
			if ((!new File(srcFile).exists())) {
				System.out.println("The source file does not exists");
			} else {
				FileReader fr = new FileReader(srcFile);
				FileWriter fw = new FileWriter(destFile);
				BufferedReader br = new BufferedReader(fr);
				BufferedWriter bw = new BufferedWriter(fw);

				String line = "";
				while ((line = br.readLine()) != null) 
					bw.write(line);

				br.close();
				bw.close();
				
				System.out.println("File copied Successfully!!");
				
			}
		} catch (IOException ix) {
			System.out.println(ix);
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the source and destination file names:");
		String srcFile = sc.next();
		String destFile = sc.next();

		copyText(srcFile, destFile);
	}

}
