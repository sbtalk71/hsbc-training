package com.demo.io.entity;

public class EmpApp {

	public static void main(String[] args) {
		EmpDao dao=new EmpDaoFileSystemImpl();
		EmpService es=new EmpService(dao);
		es.registerEmp(108, "Siya", "Hyderabad", 70000);
	}

}
