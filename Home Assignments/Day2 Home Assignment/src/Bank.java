/**
 * 
 * @author Muskan Karnani
 * This programs calls all the methods of both the classes: PersonalLoan class and HomeLoan class
 *
 */
public class Bank {
	public static void main(String[] args) {
		PersonalLoan pl=new PersonalLoan();
		pl.setName("MUSKAN");
		pl.setLoanAmt(250000);
		pl.setLoanPercentage(2.5);
		pl.setMonths(60);
		System.out.println(pl.getName()+" has got a personal loan of "+	pl.getLoanAmt()+" for "+pl.getMonths()+	" at "+pl.getLoanPercentage()+"%");
		
		HomeLoan hl=new HomeLoan();
		hl.setName("MUSKAN");
		hl.setLoanAmt(250000);
		hl.setLoanPercentage(2.5);
		hl.setMonths(60);
		System.out.println(hl.getName()+" has got a personal loan of "+hl.getLoanAmt()+" for "+hl.getMonths()+" at "+hl.getLoanPercentage()+"%");

	}
}
