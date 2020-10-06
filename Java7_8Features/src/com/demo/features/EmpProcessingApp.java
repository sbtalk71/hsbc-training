package com.demo.features;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Stream;

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
		//calculate total monthly salary per month spent on all the employees
		//list details of all emplyees from Bangalore
		//update salary for emplyees from Hyderabad by 5000 each
		
		empSet.stream()
		.filter(e->e.getSalary()>50000)
		.forEach(e->System.out.println(e.getEmpId()+" "+e.getName()));
		EmpPrinter printer=new EmpPrinter();
		empSet.stream()
		.filter(e->e.getCity().equals("Hyderabad"))
		.map(e->{e.setSalary(e.getSalary()+5000); return e;})
		//.forEach(e->System.out.println(e.getEmpId()+" "+e.getSalary()));
		//.forEach(EmpPrinter::print); //for static print method
		.forEach(printer::print);
		
		//empSet.forEach(System.out::println);
		
		empSet.stream().mapToDouble(e->e.getSalary()).sum();
		System.out.println(empSet.stream().mapToDouble(e->e.getSalary()).reduce((a,b)->a*b).getAsDouble());

		Stream<Integer> data=Stream.of(1,2);
		System.out.println(data.mapToInt(n->n).reduce((x,y)->x+y).getAsInt());
	}

}

class EmpPrinter implements Consumer<Emp>{
	
	
	  public void print(Emp e) {
	  System.out.println(e.getEmpId()+" "+e.getName()+" "+e.getCity()+" "+e.
	  getSalary()); }
	  
	  public void print2(Emp e) { System.out.println(e.getEmpId()+" "+e.getName());
	  }
	 
	
	@Override
	public void accept(Emp e) {
		 System.out.println(e.getEmpId()+" "+e.getName()+" "+e.getCity()+" ");
		
	}
}
