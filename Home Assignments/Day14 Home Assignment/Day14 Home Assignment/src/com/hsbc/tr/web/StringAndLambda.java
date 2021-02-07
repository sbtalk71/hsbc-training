/**
 * @author Muskan Karnani
 *  lambda expression using Strings
 */
package com.hsbc.tr.web;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;



public class StringAndLambda {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		for(int i=0;i<10;i++)
			list.add("String"+7*i);
		List<Integer> lengths= list.stream().map(x->x.length()).collect(Collectors.toList());
		Iterator<String> iter = list.iterator(); 
		Iterator<Integer> iter1 = lengths.iterator(); 
 
    while (iter.hasNext() && iter1.hasNext()) { 
        System.out.println(iter.next() + " has length of "+ iter1.next()); 
    } 
} 
}


