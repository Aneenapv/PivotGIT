package assignmentPart1;

import java.util.Scanner;

public class ATM extends BankOperations{

	Scanner sc = new Scanner(System.in);
	
	PersonsAccountDetails person = new PersonsAccountDetails("123456", "Aneena", 3250.50);

	BankOperations bank= new BankOperations();
	
	
	public void transaction()
	{
	System.out.println("Enter your Pin:");
	String pinEntered = sc.nextLine();

	if (person.validatePin(pinEntered)) {
		System.out.println("pin is correct");
		System.out.println("Account number =" + person.getBankAccountNumber());
		System.out.println("Account holder name =" + person.getNameOfAccountHolder());
		System.out.println("Deposit | withdraw | balance : please select your option");
		String action = sc.next();

		// BankOperations atm = new ATM();

		if (action.equalsIgnoreCase("deposit")) {
			System.out.println("deposit your cash");
			System.out.println("Enter amount to deposit: ");
			double depositAmount = sc.nextDouble();
			bank.deposit(person.getTotalFundsAvailable(), depositAmount);
		}
		if (action.equalsIgnoreCase("withdraw")) {
			System.out.println("withdraw your cash");
			System.out.println("Enter amount to withdraw : ");
			double withdrawAmount = sc.nextDouble();
			bank.withdraw(person.getTotalFundsAvailable(), withdrawAmount);

		}
		if (action.equalsIgnoreCase("balance")) {
			bank.viewBalance(person.getTotalFundsAvailable());

		}

	}

	else {
		System.out.println("Incorrect pin");
	  }
	}
}

	

