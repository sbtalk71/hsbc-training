package com.demo.q10;

public class AccountBlockedException extends Exception {
	@Override
	public String toString() {
		return "This account is blocked";
	}
}
