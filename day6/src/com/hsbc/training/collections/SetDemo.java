package com.hsbc.training.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		//HashSet<String> names=new HashSet<String>();
		//TreeSet<String> names=new TreeSet<>();
		Set<String> names= new HashSet<>();
		names.add("Shantanu");
		names.add("Kiran");
		names.add("Arun");
		names.add("James");
		names.add("Ankit");
		names.add("Shantanu");
		names.add("Dhanush");
		names.add("Rajani");

		System.out.println(names.contains("Kiran"));
		System.out.println(names);
		
		
		names.remove("Dhanush");
		System.out.println(names);
		
		names.add("Ratan");
		System.out.println(names);
		
		Iterator<String> itr=names.iterator();
		
		while(itr.hasNext()) {
			String name=itr.next();
			name="Hi,"+name;
			System.out.println(name);
		}
		
		for(String s:names) {
			System.out.println(s);
		}
		
		names.clear();
		
		System.out.println(names);
	}

}
