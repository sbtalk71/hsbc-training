package homeDay9.hsbc.jsondemo;


/**
 * 
 * @authorMegha agarwal
 * Entity class customer 
 *
 */
public class Customer {
	private int custId;
	private String custName;
	private String address;
	private double accountBalance;
	
	public Customer() {
		
	}

	public Customer(int id,String name,String address,double accBalance) {
		this.custId=id;
		this.custName=name;
		this.address=address;
		this.accountBalance=accBalance;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

}
