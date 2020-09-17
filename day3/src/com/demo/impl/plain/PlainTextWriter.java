package com.demo.impl.plain;

import com.demo.interfaces.Writer;

public class PlainTextWriter implements Writer {

	@Override
	public String getWriter() {
		// TODO Auto-generated method stub
		return "Plain Text Writer";
	}

	@Override
	public String establishConnection() {
		// TODO Auto-generated method stub
		return "Connection Established";
	}

}
