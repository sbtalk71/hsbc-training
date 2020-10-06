package com.hsbc.tr.spring.dao;

import org.springframework.stereotype.Repository;

import com.hsbc.tr.spring.entity.Emp;

@Repository
public class EmpDaoMock2Impl implements EmpDao {

	@Override
	public String save(Emp e) {
		return "Mock2: Emp Saved with id " + e.getEmpId();
	}

}
