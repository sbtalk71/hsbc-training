package com.hsbc.tr.app.service;

import com.hsbc.tr.app.dao.DuplicateEmpException;
import com.hsbc.tr.app.dao.EmpDao;
import com.hsbc.tr.app.dao.EmpNotFoundException;
import com.hsbc.tr.app.entity.Emp;

public class EmpService {

	private EmpDao dao;

	public EmpService(EmpDao dao) {
		this.dao = dao;
	}

	public String registerEmp(int id, String name, String city, double salary) {
		try {
		return dao.save(new Emp(id, name, city, salary));
		}catch(DuplicateEmpException ex) {
			throw new RuntimeException("Emp already exists");
		}
	}

	public String getEmpDetails(int id) {

		try {
			Emp e = dao.findById(id);

			return e.getEmpId() + " " + e.getName() + " " + e.getCity() + " " + e.getSalary();
		} catch (EmpNotFoundException ex) {
			throw new RuntimeException("Emp Not found");
		}
	}

	public void printEmpList() {

		for (Emp e1 : dao.listAll()) {
			System.out.println(e1.getEmpId() + " " + e1.getName() + " " + e1.getCity() + " " + e1.getSalary());
		}
	}
}
