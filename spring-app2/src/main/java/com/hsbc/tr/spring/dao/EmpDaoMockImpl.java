package com.hsbc.tr.spring.dao;

import com.hsbc.tr.spring.entity.Emp;

public class EmpDaoMockImpl implements EmpDao {

	@Override
	public String save(Emp e) {
		return "Mock: Emp Saved with id " + e.getEmpId();
	}

}
