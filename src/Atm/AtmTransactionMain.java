package Atm;

public class AtmTransactionMain {

	public static void main(String[] args) {

		AtmTransaction atm = new AtmTransaction();

		atm.storedPin = 3941;

		atm.enteredPin = 3941;

		atm.accountBalance = 4000.5;

		atm.withdrawalAmount = 2000;

		atm.overdraftAmount = 1500;

		atm.pinVerification();

	}

}
