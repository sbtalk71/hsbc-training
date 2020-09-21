package com.demo.io.app.service;

import com.demo.io.app.EmpDao;
import com.demo.io.entity.Emp;

public class EmpService {

	private EmpDao dao;

	public EmpService(EmpDao dao) {
		this.dao = dao;
	}

	public String registerEmp(int id, String name, String city, double salary) {
		String response = dao.save(new Emp(id, name, city, salary));
		return response;
	}
}
