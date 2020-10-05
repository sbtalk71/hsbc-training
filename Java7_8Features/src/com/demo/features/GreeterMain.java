package com.demo.features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class GreeterMain {

	public static void main(String[] args) {
		Greeter greeter= new Greeter();
		
		//GreetMessage gm= new GoodMorning();
		
		//greeter.greet(new GoodMorning());
		
		//greeter.greet(new GoodEvening());
		
		//greeter.greet(new GreetMessage() {
			
			//@Override
			//public String greetMessage() {
				
				//return "Good Night";
			//}
		//});
		
		
		
		//greeter.greet();
		
		
		//method signature without name->implementation
		
		List<String> names=Arrays.asList("arun","pavan","Shantanu","Shikha","Samar");
		
	
		names.stream().filter(t->t.startsWith("S")).forEach(System.out::println);

	}

}

class MyPredicate implements Predicate<String>{
	@Override
	public boolean test(String t) {
		// TODO Auto-generated method stub
		return t.startsWith("S");
	}
}

/*
 * class GoodMorning implements GreetMessage{
 * 
 * @Override public String greetMessage() {
 * 
 * return " Good Morning"; }
 * 
 * }
 * 
 * 
 * class GoodEvening implements GreetMessage{
 * 
 * @Override public String greetMessage() {
 * 
 * return " Good Evening"; }
 * 
 * }
 */