package day3.demo.db.cls;

import day3.demo.db.EmpDao;

public class EmpDaoMocJdbcImpl implements EmpDao {
	
	@Override
	public Emp findEmpById(int id)
	{
		Emp e1=new Emp(id,"");
		System.out.println("Employee found :JDBC");
		return e1;
		
	}
	
	@Override
	public String saveData(Emp e){
		
		return "Employee data saved successfully!! - JDBC";
	}

	
	@Override
	public void listAllEmp() {
		
		System.out.println("printng all employees using JDBC");
	}

}
