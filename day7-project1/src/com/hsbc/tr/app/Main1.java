package com.hsbc.tr.app;

import com.hsbc.tr.app.dao.EmpDao;
import com.hsbc.tr.app.entity.Emp;
import com.hsbc.tr.app.impl.EmpDaoListImpl;
import com.hsbc.tr.app.impl.EmpDaoMapImpl;

public class Main1 {

	public static void main(String[] args) {
		EmpDao dao=new EmpDaoListImpl();
		
		/*
		 * Emp e=dao.findById(101); if(e==null) {
		 * System.out.println("Emp Not Found"); }else {
		 * System.out.println(e.getEmpId()+" "+e.getName()+" "+e.getCity()+" "+e.
		 * getSalary()); }
		 */

		for(Emp e1: dao.listAll()) {
			System.out.println(e1.getEmpId()+" "+e1.getName()+" "+e1.getCity()+" "+e1.getSalary());
		}
	}

}
