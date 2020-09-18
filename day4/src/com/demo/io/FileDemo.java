package com.demo.io;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		File file=new File("d:\\temp\\io");
		
		System.out.println("Directory : "+file.isDirectory());
		System.out.println("Is Writable: "+file.canWrite());
	}

}
