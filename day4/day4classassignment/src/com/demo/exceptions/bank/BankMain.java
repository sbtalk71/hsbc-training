package com.demo.exceptions.bank;

public class BankMain {

	public static void main(String[] args) throws LowBalanceException {
		BalanceAccount account = new BalanceAccount(1000);

		account.withdraw(2000);
		account.withdraw(5000);
		account.withdraw(4000);
		System.out.println("Done Successfully");
	}
}
