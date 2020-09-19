package com.demo.q10;


/**
 * 
 * @author Megha Agarwal
 * calling various methods of account class and demonstrate exceptions
 *
 */
public class AppTest {
	public static void main(String[] args) {
		Account ac=new Account(1000,"Active");
		
		
		//ac.blockAccount();
		
		try {
			System.out.println("Present account balance:"+ac.getBalance());
		}
		catch(AccountBlockedException ab)
		{
			System.out.println(ab);
		}
		
		
		try {
			
			System.out.println("Total balance after deposit="+ac.deposit(2000));
			
		}
		catch(AccountBlockedException ab)
		{
			System.out.println(ab);
		}
		
		try {
			System.out.println("Total balance after withdraw:"+ac.withdraw(1000));
		}
		catch(AccountBlockedException ab)
		{
			System.out.println(ab);
		}
		catch(InsufficientBalanceException ie)
		{
			System.out.println(ie);
		}

	}

}