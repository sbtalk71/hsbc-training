package com.demo.dao;

import com.demo.entity.EmpDao;

public class EmpJdbc implements EmpDao {

	@Override
	public Emp findById(int id) {
		return null;
	}

	@Override
	public String save(Emp e) {
		e.display();
		return "saved successfully jdbc";
	}

	@Override
	public void listAllEmps() {
		System.out.println("listed successfully jdbc");// TODO Auto-generated method stub

	}

}
