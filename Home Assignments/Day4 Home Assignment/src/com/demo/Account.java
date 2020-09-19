package com.demo;

public class Account implements AccountOperationsInterface
{
	public double bal;
	public Account(double bal)
	{
		this.bal=bal;
	}
	@Override
	public double deposit(double amt)throws AccountBlockedException {
		if(bal<1000) {
			throw new AccountBlockedException("Account Blocked!!");
			
			
		}
		else 
		{
			this.bal+=amt;
			
		}
		return bal;
	}
	@Override
	public double withdraw(double amt)throws AccountBlockedException,InsufficientBalanceException {
		if(bal<100)
		{
			throw new InsufficientBalanceException("Insufficent Balance!!");
		
			
		}
		if(bal<1000)
		{
			throw new AccountBlockedException("Account Blocked!!");
		
		}
		else {
			bal=bal-amt;
		
		}
		return bal;
	}
	@Override
	public double getBalance()throws AccountBlockedException {
		// TODO Auto-generated method stub
		if(this.bal<100)
			{
			throw new AccountBlockedException("Account Blocked!!");
		
			}
			return this.bal;
	}
	@Override
	public void blockAccount() {
		this.bal=0;
		// TODO Auto-generated method stub
		
	}	
	public static void main(String[] args)throws AccountBlockedException, InsufficientBalanceException {
		{
			Account a=new Account(2000);
			System.out.println(a.deposit(10));
			System.out.println(a.withdraw(2000));
			//System.out.println(a.getBalance());
			//System.out.println(a.deposit(400));
			System.out.println(a.withdraw(1500));
			a.blockAccount();
			System.out.println(a.getBalance());
			
		}
	}

}
