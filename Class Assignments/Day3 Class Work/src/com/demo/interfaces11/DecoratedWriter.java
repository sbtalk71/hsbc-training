package com.demo.interfaces11;

import com.demo.interfaces1.Writer;

public class DecoratedWriter implements Writer
{

	@Override
	public String write(String msg) {
		System.out.println("HI, I AM A DECORATED WRITER");
		return msg;
	}

	
}
