package com.demo.exceptions.bank;

public class BalanceAccount {
	private double balance = 0.0;

	public BalanceAccount(double balance) {
		this.balance = balance;
	}

	public double withdraw(double amount) throws LowBalanceException {
		try {
			if (balance < amount)
				throw new LowBalanceException();
			else {
				balance = balance - amount;
				System.out.println("TS" + balance);
			}
		} catch (LowBalanceException e) {
			System.out.println(e);
			throw e;
		}
		return balance;
	}
}
