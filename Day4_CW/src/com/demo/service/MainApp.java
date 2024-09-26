package com.demo.service;

import com.demo.app.dao.Dao;
import com.demo.app.dao.DaoImpl;

public class MainApp {

	public static void main(String[] args) {
		Dao d = new DaoImpl();
		EmpService em = new EmpService(d);
		System.out.println(em.registerEmp(101, "julie"));
	}

}
