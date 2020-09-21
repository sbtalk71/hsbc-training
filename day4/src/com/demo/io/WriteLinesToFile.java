package com.demo.io;

import java.io.FileWriter;

public class WriteLinesToFile {

	public static void main(String[] args) throws Exception {
		String lines[] = new String[20];
		for (int i = 0; i < 20; i++) {
			if (i % 2 == 0) {
				lines[i] = "line no " + i;
			}
		}

		FileWriter fwriter = new FileWriter("demo_2.txt");
		int i = 0;
		while (i < 20) {
			if (lines[i] != null) {

				fwriter.write(lines[i] + "\n");

			}
			i++;
		}
		fwriter.flush();

	}

}
