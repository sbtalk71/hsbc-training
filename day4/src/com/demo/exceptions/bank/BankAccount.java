package com.demo.exceptions.bank;

public class BankAccount {

	private double balance = 0.0;

	public BankAccount(double balance) {
		this.balance = balance;
	}

	public double withdraw(double amount) throws LowBalanceException {
		try {
			if (balance < amount) {
				throw new LowBalanceException("Low Balance");
			} else {
				balance = balance - amount;
				System.out.println("Transaction successful, new balance is " + balance);
			}
		} catch (LowBalanceException e) {
			System.out.println(e.getMessage());

			throw e;

		}
		return balance;
	}
}
