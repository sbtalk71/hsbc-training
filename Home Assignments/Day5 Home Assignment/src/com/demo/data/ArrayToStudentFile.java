/**
 * @author Muskan Karnani
 * This is to store the data of students from an array to a file called StudentRecord.txt
 */
package com.demo.data;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
public class ArrayToStudentFile {
	public String sdata[]=new String[10];

	public void saveData()
	{
		FileWriter fw=null;
		for(int i=0;i<sdata.length;i++)
			sdata[i]="10"+i+","+"Muskan"+i+",Pune"+i+",5"+i;
		try {
			fw=new FileWriter("StudentRecord.txt");
			int i=0;
			while(i<sdata.length)
			{
				String s[]=sdata[i].split(",");
				System.out.println(s[0]+" "+s[1]+" "+s[2]+" "+s[3]+"\n");
				fw.write(s[0]+" "+s[1]+" "+s[2]+" "+s[3]+"\n");
				i++;
			}
		}catch(FileNotFoundException e)
		{
			System.out.println(e);
		}catch(IOException e)
		{
			System.out.println(e);
		}
		finally {
			try {
				if(fw!=null)
					fw.close();
				
			}
			catch(IOException e)
			{
				System.out.println(e);
			}
		}
		System.out.println("DONE SUCCESSFULLY..");
	}
	public static void main(String[] args) {
		ArrayToStudentFile obj=new ArrayToStudentFile();
		obj.saveData();
	}
	
	
}
