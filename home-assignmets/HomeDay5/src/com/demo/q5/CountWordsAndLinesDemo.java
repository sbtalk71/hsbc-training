package com.demo.q5;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class CountWordsAndLinesDemo {
	
	public static void main(String[] args) throws IOException {
		FileInputStream fir=new FileInputStream("data.txt");
		BufferedInputStream bis=new BufferedInputStream(fir);
		int countWord=0,countLine=0;
		int data=0;
		while((data=bis.read())!=-1) {
			if((char)data==' ')
				countWord+=1;
			if((char)data=='.')
				countLine+=1;
		}
		
		bis.close();
		
		System.out.println("No of words:"+countWord);
		System.out.println("No of lines:"+countLine);
	}

}
