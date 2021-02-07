package com.demo.interfaces1;

public class MainApp {

	public static void main(String[] args) {
		Writer w=MyWriterFactory.getMyWriter("plain");
		System.out.println(w.write("Hello"));
	}
}
