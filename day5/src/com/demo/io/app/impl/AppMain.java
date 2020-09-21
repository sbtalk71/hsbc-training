package com.demo.io.app.impl;

import com.demo.io.app.EmpDao;
import com.demo.io.app.service.EmpService;

public class AppMain {

	public static void main(String[] args) {
		EmpDao dao= new EmpDaoFileSystemImpl();
		EmpService service=new EmpService(dao);
		
		String resp=service.registerEmp(125, "Scott","London",67000);
		System.out.println(resp);

	}

}
