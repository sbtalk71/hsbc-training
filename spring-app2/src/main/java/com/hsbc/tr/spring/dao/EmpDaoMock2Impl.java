package com.hsbc.tr.spring.dao;

import com.hsbc.tr.spring.entity.Emp;

public class EmpDaoMock2Impl implements EmpDao {

	@Override
	public String save(Emp e) {
		return "Mock2: Emp Saved with id " + e.getEmpId();
	}

}
