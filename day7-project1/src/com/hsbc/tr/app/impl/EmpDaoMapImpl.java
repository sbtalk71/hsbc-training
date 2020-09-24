package com.hsbc.tr.app.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hsbc.tr.app.dao.EmpDao;
import com.hsbc.tr.app.dao.EmpNotFoundException;
import com.hsbc.tr.app.entity.Emp;

public class EmpDaoMapImpl implements EmpDao {

	static Map<Integer, Emp> empDB = new HashMap<>();

	public EmpDaoMapImpl() {
		empDB.put(100, new Emp(100, "Shantanu", "Hyderabad", 70000));
		empDB.put(101, new Emp(101, "Arun", "Chennai", 80000));
		empDB.put(102, new Emp(102, "Pavan", "Hyderabad", 50000));
		empDB.put(103, new Emp(103, "Kiran", "Bangalore", 50000));
		empDB.put(104, new Emp(104, "Raja", "Chennai", 60000));

	}

	@Override
	public Emp findById(int id) throws EmpNotFoundException {
		try {
			if (empDB.containsKey(id)) {
				return empDB.get(id);
			} else {
				throw new EmpNotFoundException();
			}
		} catch (EmpNotFoundException ex) {
			throw ex;
		}
	}

	@Override
	public List<Emp> listAll() {

		ArrayList<Emp> empList = new ArrayList(empDB.values());
		return empList;
	}

	@Override
	public String save(Emp e) {
		if (empDB.containsKey(e.getEmpId())) {
			return "Emp already exists";
		} else {
			empDB.put(e.getEmpId(), e);
			return "Emp Registered successfully";
		}
	}

	public Emp updateName(int id, String name) throws EmpNotFoundException {

		try {
			if (empDB.containsKey(id)) {
				Emp e1 = empDB.get(id);
				e1.setName(name);
				empDB.put(id, e1);
				return e1;
			} else {
				throw new EmpNotFoundException();
			}
		} catch (EmpNotFoundException ex) {
			throw ex;
		}
	}
}
