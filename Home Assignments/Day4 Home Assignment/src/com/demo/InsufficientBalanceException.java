package com.demo;
import java.lang.Exception;

public class InsufficientBalanceException extends Exception{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Insufficient Balance!! You have a low balance!!";
	}
	public InsufficientBalanceException(String msg)
	{
		super();
		System.out.println(msg);
	}


}
