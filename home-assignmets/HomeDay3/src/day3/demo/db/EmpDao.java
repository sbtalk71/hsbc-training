package day3.demo.db;

import day3.demo.db.cls.Emp;

public interface EmpDao {
	
	public Emp findEmpById(int id);
	
	public String saveData(Emp e);
	
	public void listAllEmp();

}
