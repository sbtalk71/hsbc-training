package com.demo.spring.dao;

import java.util.List;

import com.hsbc.tr.spring.entity.Emp;

public interface EmpDao {

	public String save(Emp e);
	public Emp findById(int id);
	public List<Emp> getAll();
	public String update(Emp e);
	public String delete(int id);
	
}
