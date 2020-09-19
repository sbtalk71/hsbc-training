package com.demo;
import java.lang.Exception;
public class AccountBlockedException extends Exception{

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Account is Blocked!! Sorry! you cannot use our deposit and withdraw operations";
	}
	public AccountBlockedException(String msg)
	{
		super();
		System.out.println(msg);
	}
	public AccountBlockedException()
	{
		super();
	}

}
