package com.hsbc.training.collections;

import java.util.HashSet;

import javax.swing.text.html.HTMLDocument.Iterator;

import com.demo.io.entity.Emp;

public class Demo {

	public static void main(String[] args) {
		HashSet<Emp> emp = new HashSet<>();
		emp.add(new Emp(101, "Supriya", "pune", 55000));
		emp.add(new Emp(102, "Shailja", "mumbai", 45000));
		emp.add(new Emp(103, "Srijith", "pune", 15000));
		emp.add(new Emp(104, "Srishti", "jaipur", 45000));
		emp.add(new Emp(105, "Tanvi", "Gurugram", 28000));

		// Adding new employee details
		emp.add(new Emp(106, "samar", "nasik", 41000));

		// Print Employee details
		java.util.Iterator<Emp> itr = emp.iterator();
		while (itr.hasNext()) {
			Object obj = (itr.next());
			System.out.println(((Emp) obj).getId() + " " + ((Emp) obj).getName() + " " + ((Emp) obj).getLoc() + " "
					+ ((Emp) obj).getSal());

		}
		System.out.println(" ");

		// finding specific employee
		for (Emp e : emp) {
		  	if (((Emp) e).getId() == 101)
				System.out.println(((Emp) e).getId() + " " + ((Emp) e).getName());
		}
		System.out.println(" ");

		// remove details of employee by id
		/*for (Emp e1 : emp) {
			if (((Emp) e1).getId() == 102) {
				emp.remove(e1);
				System.out.println("Item removed");

			} else {

				System.out.println("Item not found");
			}
			break;

		}*/
		System.out.println(" ");

		// print employee details
		for (Emp e3 : emp) {
			System.out.println(((Emp) e3).getId() + " " + ((Emp) e3).getName() + " " + ((Emp) e3).getLoc() + " "
					+ ((Emp) e3).getSal());
		}

	}

}
