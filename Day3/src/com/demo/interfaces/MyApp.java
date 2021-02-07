package com.demo.interfaces;

import com.demo.impl.Oracle.Oracle;
import com.demo.impl.mysql.MySqlDB;

public class MyApp {
	
	public static void main(String[] args)
	{
		MyConnection con = MyConFactory.getMyConnection("mysql") ;
		
		System.out.println(con.getConnectionInfo());
		System.out.println(con.getDbDetails());
	}

}
