package com.demo.filedemo;

import java.io.File;

public class FileDemo {
	
	public static void main(String[] args)
	{
		File file = new File("e:\\temp\\io");
		System.out.println(file.isDirectory());
	}
	

}
