package homeassignment;

public class Loan {
public static void main(String[] args) {
	PersonalLoan ob1=new PersonalLoan(5, 10000, 11,"Dev");
	System.out.println(ob1.data());
	System.out.println(ob1.user());
	
	HomeLoan ob2=new HomeLoan(7, 20000, 12,"Nick");
	System.out.println(ob2.data());
	System.out.println(ob2.user());
	
}
}
