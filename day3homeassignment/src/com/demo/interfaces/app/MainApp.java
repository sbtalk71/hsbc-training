package com.demo.interfaces.app;

import com.demo.interfaces.MyConFactory;
import com.demo.interfaces.MyConnection;

public class MainApp {
	public static void main(String[] args) {
		MyConnection con = MyConFactory.getMyConnection("43Inch TV");

		System.out.println(con.getConnectionInfo());
		System.out.println(con.getSizeDetails());
	}

}
