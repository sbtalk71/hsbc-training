package com.hsbc.tr.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.hsbc.tr.spring.dao.EmpDao;
import com.hsbc.tr.spring.entity.Emp;

@Service
public class EmpService {

	@Autowired
	@Qualifier("mybean")
	private EmpDao dao;
	
	private String daoId;

	public void setDaoId(String daoId) {
		System.out.println("dao Id set..");
		this.daoId = daoId;
	}

	/*
	 * public void setDao(EmpDao dao) { System.out.println("dao is set.."); this.dao
	 * = dao; }
	 */

	public String registerEmp(int id, String name, String city, double salary) {
		String response = dao.save(new Emp(id, name, city, salary));
		return response;
	}
}
