package day3.demo.db.cls;

import day3.demo.db.EmpDao;

public class EmpDaoMocHiberImpl implements EmpDao{
	
	@Override
	public Emp findEmpById(int id)
	{
		Emp e1=new Emp(id,"");
		System.out.println("Employee found :Hiber");
		return e1;
		
	}
	
	@Override
	public String saveData(Emp e){
		
		return "Employee data saved successfully!! - Hiber";
	}

	
	@Override
	public void listAllEmp() {	
		System.out.println("printng all employees using Hiber");
	}


}
