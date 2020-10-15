package com.hsbc.tr.spring;

import org.springframework.stereotype.Repository;

@Repository
public class GoodMorning implements Greeting{
  
	public String greetMessage() {
		return "Good Morning";
	}
  
    //return "Good Morning";

}
