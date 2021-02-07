package com.demo.app.dao;

import com.demo.app.entity.Emp;

public class DaoImpl implements Dao {

	@Override
	public String save(Emp e) {
		// TODO Auto-generated method stub
		return "Employee Detais added " +e;
	}

}
