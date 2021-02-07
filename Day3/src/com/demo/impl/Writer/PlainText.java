package com.demo.impl.Writer;

import com.demo.interfaces.Writer;

public class PlainText implements Writer {
	@Override
	public String Text() {
		return ("This is plain Text");
	}

}
