package com.demo.interfaces;

import com.demo.impl.DecText.DecoratedText;
import com.demo.impl.HT.HtmlText;
import com.demo.impl.Writer.PlainText;

public class MainApp {

	public static void main(String[] args) {

		
		  Writer w= new PlainText(); System.out.println(w.Text());
		  
		 Writer w1= new DecoratedText(); System.out.println(w1.Text());
		  
		  Writer w2= new HtmlText(); System.out.println(w2.Text());
		 

		Writer ww = MyFactory.getWriter("plain");
		System.out.println(ww.Text());
	}

}
