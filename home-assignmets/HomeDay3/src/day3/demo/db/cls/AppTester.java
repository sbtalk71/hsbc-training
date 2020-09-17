package day3.demo.db.cls;

import day3.demo.db.EmpDao;

public class AppTester {
	
	public static void main(String[] args) {
		
		//EmpDao ed=MyDaoFActory.getDbFactory("jdbc");					//jdbc class object
		
		EmpDao ed=MyDaoFActory.getDbFactory("hiber");				//hiber class object
		
		ed.findEmpById(500);
		
		System.out.println(ed.saveData(new Emp(101,"Shikha")));
		
		ed.listAllEmp();
		
		
	}

}
