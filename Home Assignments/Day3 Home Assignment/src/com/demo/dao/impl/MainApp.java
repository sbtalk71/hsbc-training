package com.demo.dao.impl;
import com.demo.dao.Emp;
import com.demo.entity.EmpDao;

public class MainApp {
 public static void main(String[] args) {
	EmpService obj=new EmpService();
	EmpDao ob=obj.getObject("jdbc impl");
	ob.findById(2).display();
	ob.listAllEmps();
	System.out.println(ob.save(new Emp(102,"Muskan")));
}
}
