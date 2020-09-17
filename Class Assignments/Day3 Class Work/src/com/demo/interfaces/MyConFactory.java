package com.demo.interfaces;

import com.demo.impl.oracle.MySql;
import com.demo.impl.oracle.OracleDB;

public class MyConFactory {

	public static MyConnection getMyConnection(String dbname)
	{
		if(dbname.equals("oracle"))
			return new OracleDB();
		else if(dbname.equals("MySql"))
			return new MySql();
		else 
			return null;
	}
}
