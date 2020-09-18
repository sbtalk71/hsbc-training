package com.demo.app2.dao;

import com.demo.app2.entity.Emp;

public class EmpDaoImpl implements EmpDao {

	@Override
	public String save(Emp e) {
		
		return "Emp saved with deatils "+e;
	}

}
