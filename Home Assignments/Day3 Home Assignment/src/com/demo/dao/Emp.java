package com.demo.dao;


public class Emp
{
	private int empId;
	private String name;
	public Emp()
	{
		empId=0;
		name="";
	}
	public Emp(int empId, String name)
	{
		this.empId=empId;
		this.name=name;
	}
	/*public void display(Emp e[])
	{
		for(int i=0;i<e.length;i++)
		{
			if(e[i]!=null)
		System.out.println(e[i].empId+" "+e[i].name);
		}
	}*/
	public void display()
	{
		System.out.println(empId+" "+name);
	}
	/*public void search(Emp e[],int id)
	{
		for(int i=0;i<e.length;i++)
		{
			if(e[i].empId==id)
			{
				System.out.println(e[i].empId+" "+e[i].name);
				return;
			}
		}
	}
	public void add(Emp e[],Emp ob1)
	{
		e[3]=ob1;
	}*/
	public int getEmpId()
	{
		
		return this.empId;
	}

}
