package com.demo.features;

import java.util.HashSet;
import java.util.Set;

import com.hsbc.tr.app.entity.Emp;

public class EmpProcessingApp {

	public static void main(String[] args) {
		Set<Emp> empSet = new HashSet<>();
		empSet.add(new Emp(100, "Rajesh", "Hyderabad", 45000));
		empSet.add(new Emp(101, "Scott", "London", 55000));
		empSet.add(new Emp(102, "Ashish", "Bangalore", 65000));
		empSet.add(new Emp(103, "Shantanu", "Hyderabad", 35000));
		empSet.add(new Emp(104, "Rupa", "Hyderabad", 35000));
		empSet.add(new Emp(105, "Chethan", "Delhi", 45000));
		empSet.add(new Emp(106, "Kirthi", "Bangalore", 75000));
		empSet.add(new Emp(107, "Kamal", "Bangalore", 45000));
		empSet.add(new Emp(108, "Manoj", "Hyderabad", 75000));
		empSet.add(new Emp(109, "Ramesh", "Hyderabad", 65000));
		
		//Use Lambda and Streams
		//List all employees with salary > 50000
		//calculate total monthly salary
		//list details of all emplyees from Bangalore
		//update salary for emplyees from Hyderabad by 5000 each

	}

}
