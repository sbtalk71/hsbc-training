package com.demo.service;

import com.demo.dao.EmpDao;
import com.demo.io.entity.Emp;

public class MyEmpService {
	String resp;
	EmpDao dao;

	public MyEmpService(EmpDao dao) {
		this.dao = dao;
	}

	public String   registerEmp(int id, String name, String loc, double sal) {
	
			 resp = dao.save(new Emp(id, name, loc, sal));
			 return resp;
			
		}
	
	}


