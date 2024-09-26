package com.demo.main;

import com.demo.app.impl.EmpDaoFileSystemImpl;
import com.demo.app.impl.FileExistException;
import com.demo.dao.EmpDao;
import com.demo.service.MyEmpService;

public class AppTester {

	public static void main(String[] args) {
		 EmpDao dao = new EmpDaoFileSystemImpl();
		 MyEmpService ser = new MyEmpService(dao);
		 System.out.println(ser.registerEmp(100, "shail", "mumbai", 450000));
		 

	}

}
