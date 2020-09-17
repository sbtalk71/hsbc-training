package com.demo.interfaces;

import com.demo.impl.plain.PlainTextWriter;

public class MyTextFactory {

	public static Writer getTextWriter(String text) {
		if (text.equals("plaintext"))
			return new PlainTextWriter();
		else
			return null;
	}

}
