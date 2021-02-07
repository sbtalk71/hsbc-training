/**
 * @author Muskan Karnani
 * writing the student id, name, place of residence and marks in an array of String from a file
 */
package com.demo.data;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FiletoStudentArray {
	private String sdata[]=new String[20];
	public void readAndWrite()
	{
		FileReader fr=null;
		BufferedReader br=null;
		try {
			fr=new  FileReader("StudentData.txt");
			br=new BufferedReader(fr);
			int i=0;
			while((sdata[i]= br.readLine())!=null)
			{
				//System.out.println(sdata[i]);
				i++;
			}
		}catch(FileNotFoundException e)
		{
			System.out.println(e);
		}catch(EOFException e)
		{
			System.out.println("DONE SUCCESSFULLY...");
		}catch(IOException e)
		{
			System.out.println(e);
		}
		finally
		{
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
	public void display()
	{
		System.out.println("Id \t Name \t Residence \t Marks");
		for(int i=0;i<sdata.length;i++)
		{
			if(sdata[i]!=null)
			{
				String[] details=sdata[i].split(",");
				System.out.println(details[0]+"\t"+details[1]+"\t"+details[2]+"  \t"+details[3]);
			}
		}
	}
	public static void main(String[] args) {
		{
			FiletoStudentArray obj=new FiletoStudentArray();
			obj.readAndWrite();
			obj.display();
		}
	}

}