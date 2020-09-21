package com.demo.io.entity;

public class EmpService {
	EmpDao dao;
	public EmpService(EmpDao dao)
	{
		this.dao=dao;
	}
	
	public void registerEmp(int id, String name,String city,double salary)
	{
		dao.save(new Emp(id,name,city,salary));
		
	}
	
}