package com.demo.io.entity;

import java.io.Serializable;

public class EmpWrapper implements Serializable {

	Emp[] empList;
	
	public Emp[] getEmpList() {
		return empList;
	}

	public void setEmpList(Emp[] empList) {
		this.empList = empList;
	}

	public EmpWrapper() {
		// TODO Auto-generated constructor stub
	}
	
	
}
