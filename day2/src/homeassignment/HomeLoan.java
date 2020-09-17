package homeassignment;

public class HomeLoan {
	
	private int percentage;
	private int loanamount;
	private int months;
	private String person;

	public HomeLoan(int percentage, int loanamount, int months, String person) {
		this.percentage = percentage;
		this.loanamount = loanamount;
		this.months = months;
		this.person = person;
	}
	public double data()
	{
		float emi; 
        emi=(loanamount+((percentage/100)*months))/months;
        return emi; 
	}
	public String user()
	{
		return this.person;
	}
}
