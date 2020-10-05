package com.demo.features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 16, 17, 18, 19, 20, 22);

		System.out.println(nums.stream().filter(n -> (n % 2 == 0)).max((x, y) -> x.compareTo(y)).get());

		System.out.println(nums.stream().mapToInt(n -> n).sum());

		List<String> names = Arrays.asList("Shantanu", "Champak", "Milan", "Diya", "Arun", "Shankar", "Shyam",
				"Shekhar");

		names.stream().filter(s -> s.startsWith("Sh")).filter(s -> s.length() > 7).forEach(System.out::println);

		/*
		 * List<String> names2 =names .stream()
		 * .filter(s->{if(s.startsWith("Sh")&&s.length()>7) { return true; }else {return
		 * false;}}) .collect(Collectors.toList());
		 * 
		 * 
		 */
		
		names.stream().map(s->"Hello, "+s).forEach(System.out::println);
	}
}

class x implements Comparator<Integer> {
	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
	}

	/// (o1,o2)->o1.compareTo(o2);
}