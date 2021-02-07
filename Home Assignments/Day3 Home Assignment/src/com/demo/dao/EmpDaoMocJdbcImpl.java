package com.demo.dao;

import com.demo.entity.EmpDao;

public class EmpDaoMocJdbcImpl implements EmpDao {

	@Override
	public Emp findById(int id) {
		if(id==2)
			return new Emp(2,"Muskan");
		else
		return null;
	}

	@Override
	public String save(Emp e) {
		e.display();
		return "saved successfully jdbc impl";
	}

	@Override
	public void listAllEmps() {
		System.out.println("listed successfully jdbc impl");// TODO Auto-generated method stub

	}

}
