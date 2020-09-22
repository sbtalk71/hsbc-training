package com.hsbc.training.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListDemo{

	
	public static void main(String[] args) {
		
		ArrayList<String> cities=new ArrayList<>();
		cities.add("Hyderabad");
		cities.add("Delhi");
		cities.add("Noida");
		cities.add("Bhopal");
		cities.add("Simla");
		cities.add("Mumbai");
		cities.add("Hyderabad");
		
		cities.add(2,"Chandigarh");
		cities.remove(5);
		
		System.out.println(cities);
		
		Collections.sort(cities,new MyListSorter());
		
		System.out.println("After Sort :"+cities);
		
		

	}

	

}

class MyListSorter implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);
	}
	
	
}
