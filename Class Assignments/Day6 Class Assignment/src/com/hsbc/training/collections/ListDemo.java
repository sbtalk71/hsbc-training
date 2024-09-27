package com.hsbc.training.collections;

import java.util.ArrayList;

public class ListDemo {

	public static void main(String[] args) {
		ArrayList<String> cities=new ArrayList<>();
		//allows unsorted duplicate data but ordered(i.e. if we add or remove, the order remains same) collection
		cities.add("Lakhimpur");
		cities.add("Delhi");
		cities.add("Noida");
		cities.add("Bhopal");
		cities.add("Shimla");
		cities.add("Lucknow");
		cities.add("Mumbai");
		cities.add("Pune");
		System.out.println(cities);

		cities.add(2," Chandigarh"); //as in 0,1,2
		System.out.println(cities);
		cities.remove(5);
		System.out.println(cities);
		//For Sorting, we need to use Comparator interface
		
		//to check the identity and integrity of an object, we use equals() and hashCode()
		
		
	}

}
