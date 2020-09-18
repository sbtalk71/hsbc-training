
public class EmpDb {

	Emp[] empList = new Emp[10];

	public EmpDb() {
		for(int i=0;i<2;i++) {
			empList[i]=new Emp();
			empList[i].setEmpDetails(100+i, "Kiran");
		}
	}

	public String add(Emp e) {
		String message="";
		for (int i = 0; i < empList.length; i++) {
			if (empList[i] == null) {
				empList[i] = e;
				message="Emp added";
				break;
			} else {
				message= "DB Full";
			}
		}
		return message;
	}

	public Emp findEmp(int id) {

		return null;
	}

	public void listAllEmps() {
		for(int i=0;i<empList.length;i++) {
			if(empList[i]!=null) {
				System.out.println(empList[i].getEmpInfo());
			}
		}
	}
	
	public static void main(String[] args) {
		EmpDb db= new EmpDb();
		Emp e= new Emp(102, "Arun");
		System.out.println(db.add(e));
		db.listAllEmps();
	}
}
