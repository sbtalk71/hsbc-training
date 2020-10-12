package com.hsbc.tr.spring.entity;

public class Emp {
	private int empId;
	private String name;
	private String city;
	private double salary;

	public Emp() {
		System.out.println("Emp Created...");
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
		System.out.println("Emp Id is set...");
		this.empId = empId;
	}

	public String getName() {
		
		return name;
	}

	public void setName(String name) {
		System.out.println("Emp Name is set...");
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		System.out.println("Emp City is set...");
		this.city = city;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		System.out.println("Emp Salary is set...");
		this.salary = salary;
	}

}
