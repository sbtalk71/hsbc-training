package exception;

public class Main {

	public static void main(String[] arg) {
		BankAccount b = new BankAccount();
		try {
			double a = b.withdraw(500);
			System.out.println(a);
			System.out.println("done successfully");
		}
		 catch (LowBalanceException e) {
			System.out.println(e);

		}
	}
}


