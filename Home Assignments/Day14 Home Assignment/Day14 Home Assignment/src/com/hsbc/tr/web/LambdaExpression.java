/**
 * @author Muskan Karnani
 *  lambda expression
 */

package com.hsbc.tr.web;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaExpression {

	public static void main(String[] args) {
		List<Integer> al=new ArrayList<>();
		for(int i=10;i<=40;i++) {
			al.add(i);
		}
		//Display odd numbers
		System.out.print("Odd numbers are : ");
		al.stream().filter(num->(num%2!=0)).forEach(System.out::println);
		//calculate sum of all even numbers using reduce()
		System.out.println("Sum of all even numbers : "+al.stream().filter(num->(num%2==0)).reduce(0,(a,b)->(a+b)));
		//Max value from all odd numbers
		System.out.println("Max value from all odd numbers are : ");
		System.out.println(al.stream().filter(num->num%2!=0).max((a,b)->a.compareTo(b)).get());
	}

}
class x implements Comparator<Integer>{
	@Override
	public int compare(Integer o1, Integer o2) {
		return o1.compareTo(o2);
	}
}