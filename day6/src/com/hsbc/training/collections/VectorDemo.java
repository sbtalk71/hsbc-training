package com.hsbc.training.collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import com.demo.io.entity.Emp;

public class VectorDemo {

	public static void main(String[] args) {

		
		
		Vector<Emp> empList=new Vector<>();
		
		empList.add(new Emp(100, "Shantanu", "Hyderabad", 34000));
		empList.add(new Emp(101, "Arun", "Hyderabad", 34000));
		empList.add(new Emp(102, "Kiran", "Hyderabad", 34000));
		empList.add(new Emp(103, "Varun", "Hyderabad", 34000));
		
		Emp e=new Emp(104, "kamal", "Hyderabad", 34000);
		
		empList.add(e);
	
		
		System.out.println(empList.contains(e));
		System.out.println(empList);
		
		Iterator<Emp> itr=empList.iterator();
		while(itr.hasNext()) {
			Emp e1=itr.next();
			System.out.println(e1.getName());
		}
		
		Enumeration<Emp> empEnum=empList.elements();
		while(empEnum.hasMoreElements()) {
			Emp e1=empEnum.nextElement();
			System.out.println(e1.getName());
		}

		for(Emp e1: empList) {
			System.out.println(e1.getName());
		}

	}

}
