package com.demo.inheritance.demo2;

public class TraineeEmp extends Employee {
	public TraineeEmp(int id, String name, double salary, String performance) {
    super(id,name,salary);
    
   // this.performance = performance;
    
	}
	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return super.getDetails();
	}
}
