package com.demo;

public interface AccountOperationsInterface {
	
		public double deposit(double amt) throws AccountBlockedException;
		public double withdraw(double amt) throws AccountBlockedException, InsufficientBalanceException;
		public double getBalance() throws AccountBlockedException;
		public void blockAccount();
		

}
