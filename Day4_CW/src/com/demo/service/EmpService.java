package com.demo.service;

import com.demo.app.dao.Dao;
import com.demo.app.entity.Emp;

public class EmpService {

	Dao d;

	public EmpService(Dao d) {
		this.d = d;

	}

	public String registerEmp(int id, String name) {

		String resp = d.save(new Emp(id, name));
		return resp;
	}

}
