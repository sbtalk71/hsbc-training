package exception;

public class BankAccount {

	private double balance = 1000;

	public double withdraw(double amount) throws LowBalanceException {
		try {
			if (amount > balance)
				throw new LowBalanceException();
			// System.out.println(toString());

			else {
				balance = balance - amount;
				// System.out.println("Amount Withdrawn" );
			}
		} catch (LowBalanceException e) {
			// System.out.println(e);
			throw e;

		}

		return balance;

	}
}
