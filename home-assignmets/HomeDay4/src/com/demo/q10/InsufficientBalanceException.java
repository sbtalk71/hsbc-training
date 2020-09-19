package com.demo.q10;

public class InsufficientBalanceException extends Exception{
	
	@Override
	public String toString() {
		return "Not enough balance to withdraw";
	}

}
