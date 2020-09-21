/**
 * @author Muskan Karnani
 * This is to count the number of words from a file named Words.txt which contains 16 words.
 */

package com.demo.data;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountNumberOfWords {

	public static void main(String[] args) {
		FileReader fr=null;
		BufferedReader br=null;
		try {
			fr=new FileReader("Words.txt");
			br=new BufferedReader(fr);
			String s=br.readLine();
			String str[]=s.split("\\s+|,\\s*|\\.\\s*"); //delimiters can be "." or "," or " "
			System.out.println("The total number of Words are : "+str.length);
		}catch(FileNotFoundException e)
		{
			System.out.println(e);
		}catch(EOFException e)
		{
			System.out.println(e);
		}catch(IOException e)
		{
			System.out.println(e);
		}
		finally {
			try {
				if(fr!=null)
					fr.close();
				if(br!=null)
					br.close();
			}catch(IOException e)
			{
				System.out.println(e);
			}
		}
		
	}

}
