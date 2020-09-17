package com.demo.interfaces.app;

//import com.demo.impl.oracle.OracleDB;
import com.demo.interfaces.MyConnection;
import com.demo.interfaces.MyConFactory;

public class MainApp {
	public static void main(String[] args) {

		MyConnection con = MyConFactory.getMyConnection("mysql");

		System.out.println(MyConnection.releaseVer);
		System.out.println(con.getConnectionInfo());
		System.out.println(con.getDbDetails());
	}
}
