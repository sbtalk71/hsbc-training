/**
 * @author Muskan Karnani
 * Taking the filename from command line arguments and tranferring the contents of data.txt file to this text file
 */

package com.demo.data;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CommandLineArguments {

	public static void main(String[] args) {
		FileReader fr=null;
		FileWriter fw=null;
		String filename="";
		for(int i=0;i<args.length;i++)
			filename=filename+args[i];
		System.out.println(filename);
		try {
			fr=new FileReader("data.txt");
			fw=new FileWriter(filename);
			int t=0;
			while((t=fr.read())!=-1)
			{
				System.out.print((char)t);
				fw.write((char)t);
			}
		}catch(FileNotFoundException e)
		{
			System.out.println(e);
		}catch(EOFException e)
		{
			System.out.println("DOONE SUCCESSFULLY!");
		}catch(IOException e)
		{
			System.out.println(e);
		}
		finally {
			try {
			if(fr!=null)
				fr.close();
			if(fw!=null)
				fw.close();
			}catch(IOException e)
			{
				System.out.println(e);
			}
		}
	}

}
