package com.demo.exceptions.bank;

public class LowBalanceException extends Exception {

	@Override
	public String toString() {

		return "Your Balance is Low";
	}
}
