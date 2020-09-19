package com.demo.q10;

public class Account implements AccountOperationInterface{
	
	double balance;
	String status;
	public Account(double balance,String status) {
		this.balance=balance;
		this.status=status;
	}
	
	@Override
	public void blockAccount() {
		// TODO Auto-generated method stub
		
			this.status="block";
			this.balance=0.0;
	}
	
	@Override
	public double deposit(double amt) throws AccountBlockedException {
		// TODO Auto-generated method stub
		if(status=="block")
			throw new AccountBlockedException();
		else
			balance+=amt;
		return balance;
			
	}

	@Override
	public double getBalance() throws AccountBlockedException {
		// TODO Auto-generated method stub
		if(status.equals("block"))
			throw new AccountBlockedException();
		return balance;
	}
@Override
	public double withdraw(double amt) throws AccountBlockedException, InsufficientBalanceException {

		if(status.equals("block"))
			throw new AccountBlockedException();
		else if(balance<amt || balance<1000)
			throw new InsufficientBalanceException();
		else
			this.balance-=amt;
		return balance;
	}
}
