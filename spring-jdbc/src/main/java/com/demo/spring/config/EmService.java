package com.demo.spring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.spring.dao.EmpDao;
import com.hsbc.tr.spring.entity.Emp;

@Service
public class EmService {

	@Autowired
	EmpDao dao;
	
	public String registerEmp(int id, String name, String city, double salary) {
		return dao.save(new Emp(id, name, city, salary));
	}
}
