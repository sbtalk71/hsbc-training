package com.hsbc.training.collections;

//import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		//HashSet<String> names=new HashSet<String>();
		//Unordered collection of unique data but not allows duplicate entries.
TreeSet<String> names=new TreeSet<String>();
	names.add("Muskan");
	names.add("Shekhar");
	names.add("Joey");
	names.add("Priya");
	names.add("Krishna");
	names.add("Krishan");
	names.add("Radhey");
	System.out.println(names);
	names.add("Muskan");
	names.remove("Muskan");
	System.out.println(names);
	Iterator<String> itr=names.iterator();
	
	while(itr.hasNext())
	{
		System.out.println("Hi, "+itr.next());
	}
	System.out.println(names);
	
	}
	
}

