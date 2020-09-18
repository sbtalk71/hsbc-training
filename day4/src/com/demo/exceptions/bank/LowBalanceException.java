package com.demo.exceptions.bank;

public class LowBalanceException extends Exception {

	public LowBalanceException() {

	}

	public LowBalanceException(String message) {
		super(message);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "You Balance is Low";
	}
}
