package com.demo.interfaces.app;

//import com.demo.impl.plain.PlainTextWriter;
import com.demo.interfaces.MyTextFactory;
import com.demo.interfaces.Writer;

public class MaiTextApp {

	public static void main(String[] args) {
		Writer con = MyTextFactory.getTextWriter("plaintext");

		System.out.println(con.getWriter());
		System.out.println(con.establishConnection());
	}
}
