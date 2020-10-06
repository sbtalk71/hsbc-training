package com.hsbc.tr.app.entity;

public class Emp {

	private int empId;
	private String name;
	private String city;
	private double salary;

	public Emp() {

	}

	public Emp(int empId, String name, String city, double salary) {
		this.empId = empId;
		this.name = name;
		this.city = city;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public boolean equals(Object obj) {
		Emp e = (Emp) obj;
		if (e.getEmpId() == this.getEmpId()) {
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.getEmpId();
	}
	
	@Override
	public String toString() {
		
		return empId+" "+name+" "+city+" "+salary;
	}
	
}
