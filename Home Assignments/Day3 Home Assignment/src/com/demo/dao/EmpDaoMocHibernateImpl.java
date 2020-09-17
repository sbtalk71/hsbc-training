package com.demo.dao;

import com.demo.entity.EmpDao;

public class EmpDaoMocHibernateImpl implements EmpDao {

	@Override
	public Emp findById(int id) {
		return null;
	}

	@Override
	public String save(Emp e) {
		e.display();
		return "saved successfully jdbc hib";

	}

	@Override
	public void listAllEmps() {
		System.out.println("listed successfully hib");// TODO Auto-generated method stub

	}

}
