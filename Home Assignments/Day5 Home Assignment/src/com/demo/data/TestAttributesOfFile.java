/**
 * @author Muskan Karnani
 * This is to show all the basic attributes that a file has in java
 */
package com.demo.data;

import java.io.File;

public class TestAttributesOfFile {

	public static void main(String[] args) {

		File f=new File("E:\\training\\Day5 Home Assignment\\src\\file1.txt");
		System.out.println("Does the file exists? :"+f.exists());
		System.out.println("Is it a Directory? :"+f.isDirectory());
		System.out.println("The file path is :"+f.getPath());
		System.out.println("The absolute path is :"+f.getAbsolutePath());
		System.out.println("The parent of this file is :"+f.getParent());
		System.out.println("Is this file writable? :"+f.canWrite());
		System.out.println("Is this file readable? :"+f.canRead());
		System.out.println("Is the file executable? :"+f.canExecute());
		System.out.println("This file was last modified :"+f.lastModified());
		System.out.println("The size of this file is : "+f.length()+" bits");
	}

}
