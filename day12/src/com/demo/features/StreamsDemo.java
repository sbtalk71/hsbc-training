package com.demo.features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import sun.security.util.Length;

public class StreamsDemo {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		nums.stream().filter(n -> (n % 2 == 0)).forEach(System.out::println);
		// nums.stream().filter(n -> (n % 2 != 0)).forEach(System.out::println);
		System.out.print("Max even no is : ");
		System.out.println(nums.stream().filter(n -> (n % 2 == 0)).max((x, y) -> x.compareTo(y)).get());
		System.out.println(nums.stream().mapToInt((n) -> n).sum());

		List<String> names = Arrays.asList("Shantanu", "Deepak");
		names.stream().filter(s -> s.startsWith("Sh")).filter(s -> s.length() > 7).forEach(System.out::println);

		names.stream().filter(s -> s.startsWith("Sh") && s.length() > 7).forEach(System.out::println);

		List<String> res = names.stream().filter(s -> s.startsWith("Sh") && s.length() > 7)
				.collect(Collectors.toList());
		
		res.forEach(s -> System.out.println(s));
		
		List<String> res1=names.stream().map(s -> "Hello " + s).collect(Collectors.toList());
        
		res1.forEach(s -> System.out.println(s));
		
		
	}
}

class x implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
	}

}
