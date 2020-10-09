package com.demo.spring;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository
public class GoodMorning implements Greeting {

	@Override
	public String greetMessage() {
		return " Good Morning to all";
	}

}
