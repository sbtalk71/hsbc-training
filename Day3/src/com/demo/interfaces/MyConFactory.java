package com.demo.interfaces;

import com.demo.impl.Oracle.Oracle;
import com.demo.impl.mysql.MySqlDB;

public class MyConFactory {

	
	public static MyConnection getMyConnection(String dbname)
	{
		if(dbname.equals("oracle"))
			return new Oracle();
		else if(dbname.equals("mysql"))
			return new MySqlDB();
		else 
			return null;
		
	}
}
