package com.hsbc.tr.app;

import com.hsbc.tr.app.dao.EmpDao;
import com.hsbc.tr.app.impl.EmpDaoJdbcImpl;
import com.hsbc.tr.app.service.EmpService;

public class Main2 {

	public static void main(String[] args) {
		EmpDao dao = new EmpDaoJdbcImpl();

		EmpService service = new EmpService(dao);
		
		try {
			System.out.println(service.registerEmp(104, "Chetan", "Kochi", 89000));
			//System.out.println(service.getEmpDetails(103));
			
		} catch (RuntimeException ex) {
			System.out.println(ex.getMessage());
		}
		
		System.out.println("|-----------------------|");

		// String resp=service.registerEmp(105, "Raman", "Bhopal", 67000);
		// System.out.println(resp);

		service.printEmpList();
	}
}
