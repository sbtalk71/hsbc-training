package com.demo.q34;

import java.io.Serializable;

public class Student implements Serializable {
	
	public int getStudId() {
		return studId;
	}

	public String getName() {
		return name;
	}

	private int studId;
	private String name;
	
	public Student(int studId,String name) {
		this.studId=studId;
		this.name=name;
	}

}
