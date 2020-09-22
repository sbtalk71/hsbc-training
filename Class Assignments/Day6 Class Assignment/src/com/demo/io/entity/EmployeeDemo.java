package com.demo.io.entity;

import java.util.HashSet;
import java.util.Iterator;

public class EmployeeDemo {

	public static void main(String[] args) {
		HashSet<Emp> employees=new HashSet<Emp>();
		//HashSet<Integer,String,String,Double> employees=new HashSet<Integer,String,String,Double>();
		Emp e=new Emp(101,"Muskan","Lucknow",25000);
		employees.add(e);
		Emp e1=new Emp(101,"Muskan","Lucknow",25000);
		employees.add(e1);//contains will check for only object reference, if we add the same data using different object, it will be added
		employees.add(new Emp(104,"Joey","Kota",75000));
		employees.add(new Emp(106,"Joy","Jaipur",95000));
		employees.add(new Emp(102,"Mohit","Pune",65000));
		employees.add(new Emp(107,"Luke","Hyd",35000));
		Iterator<Emp> itr=employees.iterator();
		System.out.println(employees.contains(e));

		while(itr.hasNext())
		{
			Emp emp=itr.next();
			System.out.println(emp.getEmpId()+" "+emp.getName()+" "+emp.getCity()+" "+emp.getSalary());
		}
		employees.remove(e);
		itr=null;
		System.out.println();
		itr=employees.iterator();
		//No need of Iterator here, a benefit !!
		for (Emp emp : employees) {
			System.out.println(emp.getEmpId()+" "+emp.getName()+" "+emp.getCity()+" "+emp.getSalary());
		}
		System.out.println();
		while(itr.hasNext())
		{
			Emp emp=itr.next();
			System.out.println(emp.getEmpId()+" "+emp.getName()+" "+emp.getCity()+" "+emp.getSalary());
		}
		//or we can override toString() to print Employees just like String 
		System.out.println(employees);
		System.out.println(employees.contains(e));// will check for reference only, better to check by value,i.e. using iterator
		itr=null;
		itr=employees.iterator();
		while(itr.hasNext())
		{
			Emp emp=itr.next();
			if(emp.getEmpId()==e.getEmpId()) {
				employees.remove(e);
			}
			//System.out.println(emp.getEmpId()+" "+emp.getName()+" "+emp.getCity()+" "+emp.getSalary());}
		}
		itr=null;
		System.out.println();
		itr=employees.iterator();
		//No need of Iterator here, a benefit !!
		for (Emp emp : employees) {
			System.out.println(emp.getEmpId()+" "+emp.getName()+" "+emp.getCity()+" "+emp.getSalary());
		}
		
	}

}
