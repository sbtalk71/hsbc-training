package com.demo.interfaces.app;

import com.demo.impl.mysql.MySqlDB;
import com.demo.interfaces.MyConFactory;
import com.demo.interfaces.MyConnection;

public class MainApp {

	public static void main(String[] args) {
		MyConnection con=MyConFactory.getMyConnection("mysql");
		
		System.out.println(MyConnection.releaseVer);
		System.out.println(con.getConnectionInfo());
		System.out.println(con.getDbDetails());

	}

}
