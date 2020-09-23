package com.hsbc.training.collections;

import java.util.LinkedList;
import java.util.List;

import com.demo.io.entity.Emp;

public class ListDemo2 {

	public static void main(String[] args) {

		//ArrayList<Emp> empList = new ArrayList<>();
		
		List<Emp> empList=new LinkedList<>();
		
		empList.add(new Emp(100, "Shantanu", "Hyderabad", 34000));
		empList.add(new Emp(101, "Arun", "Hyderabad", 34000));
		empList.add(new Emp(102, "Kiran", "Hyderabad", 34000));
		empList.add(new Emp(103, "Varun", "Hyderabad", 34000));
		
		Emp e=new Emp(104, "kamal", "Hyderabad", 34000);
		
		//empList.add(e);
	
		
		System.out.println(empList.contains(e));
		
		//System.out.println(empList);

		for(Emp e1: empList) {
			System.out.println(e1);
		}
		

	}

}
