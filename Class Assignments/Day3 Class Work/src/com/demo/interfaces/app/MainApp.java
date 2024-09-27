package com.demo.interfaces.app;
import com.demo.impl.oracle.OracleDB;
import com.demo.impl.oracle.MySql;
import com.demo.interfaces.MyConFactory;
import com.demo.interfaces.MyConnection;;
public class MainApp {

	public static void main(String[] args) {
		/*MyConnection con=new OracleDB();
		
		System.out.println(MyConnection.releaseVer);
		System.out.println(con.getDbDetails());
		System.out.println(con.getConnectionInfo());
		
		MyConnection con1=new MySql();
		
		System.out.println(MyConnection.releaseVer);
		System.out.println(con1.getDbDetails());
		System.out.println(con1.getConnectionInfo());*/
		MyConnection con=MyConFactory.getMyConnection("oracle");
		System.out.println(con.getConnectionInfo());
		System.out.println(con.getDbDetails());
	}

}
