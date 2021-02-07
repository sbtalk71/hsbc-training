package com.demo.impl.DecText;

import com.demo.interfaces.Writer;

public class DecoratedText implements Writer {
	@Override
	public String Text() {
		return ("This is Decorated Text");
	}

}
