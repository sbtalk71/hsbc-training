package com.hsbc.training.collections;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {
	public static void main(String[] args)
	{
		HashSet <String> names  = new HashSet<>();
		
		names.add("Supriya");
		names.add("Srijith");
		names.add("Shailja");
		names.add("Samar");
		names.add("Pratyush");
		
		System.out.println(names.contains("Srijith"));
		
		System.out.println(names);
		names.remove("Pratyush");
		System.out.println(names);
		
		Iterator <String> itr =names.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
