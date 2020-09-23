package com.hsbc.tr.app.impl;

import java.util.LinkedList;
import java.util.List;

import com.hsbc.tr.app.dao.EmpDao;
import com.hsbc.tr.app.entity.Emp;

public class EmpDaoListImpl implements EmpDao {

	static List<Emp> empDB = new LinkedList<Emp>();

	public EmpDaoListImpl() {
		empDB.add(new Emp(100, "Shantanu", "Hyderabad", 70000));
		empDB.add(new Emp(101, "Arun", "Chennai", 80000));
		empDB.add(new Emp(102, "Pavan", "Hyderabad", 50000));
		empDB.add(new Emp(103, "Kiran", "Bangalore", 50000));
		empDB.add(new Emp(104, "Raja", "Chennai", 60000));

	}

	public Emp findById(int id) {
		
		for(Emp e:empDB) {
			if(e.getEmpId()==id) {
				return e;
			}
		}
		return null;
		
	}

	@Override
	public List<Emp> listAll() {
		
		return empDB;
	}

	@Override
	public String save(Emp e) {
		// TODO Auto-generated method stub
		return null;
	}
}
