package com.hsbc.tr.app.entity.Emp;

public class Emp {
	int EmpId;
	String EmpName;
	String EmpCity;
	int EmpSalary;

	public Emp(int EmpId, String EmpName, String EmpCity, int EmpSalary) {
		this.EmpId = EmpId;
		this.EmpCity = EmpCity;
		this.EmpName = EmpName;
		this.EmpSalary = EmpSalary;
	}

	public int getEmpId() {
		return EmpId;
	}

	public void setEmpId(int empId) {
		EmpId = empId;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public String getEmpCity() {
		return EmpCity;
	}

	public void setEmpCity(String empCity) {
		EmpCity = empCity;
	}

	public int getEmpSalary() {
		return EmpSalary;
	}

	public void setEmpSalary(int empSalary) {
		EmpSalary = empSalary;
	}

}
