package com.hsbc.tr.app;

import com.hsbc.tr.app.dao.EmpDao;

public class Main3 {

	public static void main(String[] args) throws Exception{
		
		EmpDao dao=(EmpDao)Class.forName("com.hsbc.tr.app.impl.EmpDaoMapImpl").newInstance();
		
		System.out.println(dao.findById(103).getName());
		
		//System.out.println(dao.getClass().getName());
		
		

	}

}
