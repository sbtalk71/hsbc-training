package com.demo.io.entity;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EmpDaoFileSystemImpl implements EmpDao {

	@Override
	public void save(Emp e) {
		FileReader fr=null;
		FileWriter fw = null;
		String message="Employee not written";
		BufferedReader br = null;
		try {
			fr=new FileReader("emp.txt");
			br=new BufferedReader(fr);
			String line="";
			//System.out.println(e.getEmpId()+","+e.getName()+","+e.getCity()+","+e.getSalary());
			while((line=br.readLine())!=null) {
				if(line.contains(""+e.getEmpId())) {
					throw new EmpExistsException("OOPS!! Employee Already Exists!!");
				}
			}
			fw=new FileWriter("emp.txt", true);
			String empData=e.getEmpId()+","+e.getName()+","+e.getCity()+","+e.getSalary()+"\n";
			fw.write(empData);
			fw.flush();
			message="Employee written to file";
			
		}catch(FileNotFoundException e1)
		{
			System.out.println(e1);
		}catch(EOFException e1)
		{
			System.out.println(e1);
		}catch(IOException e1)
		{
			System.out.println(e1);
		} catch (EmpExistsException e1) {
			e1.printStackTrace();
		}
		finally {
			try {
				if(fw!=null )
					fw.close();
				if(br!=null)
					br.close();
				if(fr!=null)
					fr=null;
			}catch(IOException e1)
			{
				System.out.println(e1);
			}
		}
		System.out.println(message);
	}

}
