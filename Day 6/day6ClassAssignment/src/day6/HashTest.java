package day6;

import java.util.HashSet;

public class HashTest {
	public static void main(String[] args) {
		HashSet<Emp> hs = new HashSet<Emp>();

		Emp e1 = new Emp(122, "Dev", "gkp", 10000);
		Emp e2 = new Emp(121, "Ved", "alld", 22220);
		Emp e3 = new Emp(1261, "Ram", "alld", 22220);
		Emp e4 = new Emp(1221, "Arjun", "alld", 22220);
		Emp e5 = new Emp(1421, "Raj", "alld", 22220);
		Emp e6 = new Emp(1521, "Lakhan", "alld", 22220);

		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);
		hs.add(e5);
		hs.add(e6);

		java.util.Iterator<Emp> itr = hs.iterator();
		while (itr.hasNext()) {
			Emp type = (Emp) itr.next();
			System.out.println(type.getName());

		}
		System.out.println(hs);

		for (Emp emp : hs) {
			System.out.println(emp.getEmpId());
		}

	}

}
