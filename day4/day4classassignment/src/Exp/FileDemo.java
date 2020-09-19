package Exp;

import java.io.File;

public class FileDemo {
	public static void main(String[] args) {
		File file = new File("f:\\temp\\io");

		System.out.println(file.isDirectory());
		System.out.println(file.canWrite());
	}
}
