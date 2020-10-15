package com.hsbc.tr.app.entity.Emp;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

import javax.swing.text.html.HTMLDocument.Iterator;

import com.sun.org.apache.xml.internal.serialize.Printer;

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

		empSet.stream().filter(e -> e.getEmpSalary() > 50000)
				.forEach(e -> System.out.println(e.getEmpId() + " " + e.getEmpName()));

		System.out.println("----------------");

		empSet.stream().filter(e -> e.getEmpCity() == "Hyderabad").map(e -> {
			e.setEmpSalary(e.getEmpSalary() + 5000);
			return e;
		}).forEach(e -> System.out.println(e.getEmpId() + " " + e.getEmpName() + " " + e.getEmpSalary()));

		System.out.println("----------------");

		System.out.println(empSet.stream().mapToDouble(e -> e.getEmpSalary()).sum());

		System.out.println("----------------");

		System.out.println(empSet.stream().mapToDouble(e -> e.getEmpSalary()).reduce((a, b) -> a + b).getAsDouble());
	
//		empSet.stream().filter(e -> e.getEmpSalary() > 50000)
//		.forEach(printer::print);
	}

}

class EmpPinter implements Consumer<Emp>{
	public static void print(Emp e) {
		System.out.println(e.getEmpCity() + " " + e.getEmpName());
	}

	@Override
	public void accept(Emp t) {
		// TODO Auto-generated method stub
		
	}
}