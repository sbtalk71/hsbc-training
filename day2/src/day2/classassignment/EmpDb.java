package day2.classassignment;

public class EmpDb {

	Emp[] empList = new Emp[10];

	public EmpDb() {
		empList[0] = new Emp(100, "Dev");
		empList[1] = new Emp(200, "Nick");

	}

	public String add(Emp e) {
		String msg = "";
		int i = 0;
		for (i = 0; i < empList.length; i++) {
			if (empList[i] == null) {
				empList[i] = e;
				break;
			}
		}
		if (i == empList.length)
			msg = "DB is Full";

		msg = "Emp Added";
		return msg;
	}

	public Emp findEmp(int id) {
		Emp resEmp = empList[0];
		for (int i = 0; i < empList.length; i++) {
			if (empList[i].getEmpid() == id) {
				resEmp = empList[i];
				break;
			}
		}
		return resEmp;
	}

	public void listAllEmps() {
		for (int i = 0; i < empList.length; i++) {
			if (empList[i] != null) {
				System.out.println(empList[i].getEmpInfo());
			}
		}
	}

	public static void main(String[] args) {
		EmpDb db = new EmpDb();
		Emp e = new Emp(102, "Roy");
		System.out.println("Adding Employee:");
		System.out.println(db.add(e));
		System.out.println("Listing all:");
		db.listAllEmps();
		System.out.println("Finding Id 200:");
		System.out.println(db.findEmp(200).getEmpInfo());

	}
}
