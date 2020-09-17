package com.demo.interfaces;

import com.demo.impl.DecText.DecoratedText;
import com.demo.impl.HT.HtmlText;
import com.demo.impl.Writer.PlainText;

public class MyFactory {
	
	public static Writer getWriter(String text)
	{
		if(text.equals("plain"))
			return new PlainText();
		else if(text.equals("decorated"))
			return new DecoratedText();
		else if(text.equals("html"))
			return new HtmlText();
		else 
			return null;
		
	}

}
