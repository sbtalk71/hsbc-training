package day3.demo.db.cls;

import day3.demo.db.EmpDao;

public class MyDaoFActory {
	
	public static EmpDao getDbFactory(String dname)
	{
		if(dname.equals("jdbc"))
			return new EmpDaoMocJdbcImpl();
		
		else if(dname.equals("hiber"))
			return new EmpDaoMocHiberImpl();
		
		else
			return null;
	}

}
