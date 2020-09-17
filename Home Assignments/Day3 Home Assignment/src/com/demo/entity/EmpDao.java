package com.demo.entity;
import com.demo.dao.Emp;
public interface EmpDao {
	public Emp findById(int id);
	public String save(Emp e);
	public void listAllEmps();

}
