package assignmentPart2;

import java.util.*;

import assignmentPart1.PersonsAccountDetails;

public class ATM extends BankOperations{

		Scanner sc = new Scanner(System.in);
		
		PersonsAccountDetails person = new PersonsAccountDetails("123456", "Aneena", 3250.50);

		//BankOperations bank= new BankOperations();
			
	@Override
	public void changePinPassword()
	{
		System.out.println("Please update your pin");
		System.out.println("Enter your new pin to update: ");
		String newPin = sc.nextLine();
		
		
		if(newPin.equals(person.getPin()))
		{
			System.out.println("Please provide different pin not same as old pin");	
			System.exit(0);
		}
		else
		{
			if(newPin.length()<4)
			{
				System.out.println("Pin should be 4 digits");
			}
			else
			{
			System.out.println("Pin updated successfully");
			person.setPin(newPin);
		    }
		}
			
		    System.out.println("for your reference current pin = "+person.getPin());
			System.out.println("Enter your Pin:");
			String pinEntered = sc.nextLine();
			
			if(person.validatePin(pinEntered))
				{
				System.out.println("pin is correct");
				System.out.println("Account number =" + person.getBankAccountNumber());
				System.out.println("Account holder name =" + person.getNameOfAccountHolder());
				System.out.println("Deposit | withdraw | balance : please select your option");
				String action = sc.next();

				 ATM atm = new ATM();

				if (action.equalsIgnoreCase("deposit")) {
					System.out.println("deposit your cash");
					System.out.println("Enter amount to deposit: ");
					double depositAmount = sc.nextDouble();
					atm.deposit(person.getTotalFundsAvailable(), depositAmount);
				}
				if (action.equalsIgnoreCase("withdraw")) {
					System.out.println("withdraw your cash");
					System.out.println("Enter amount to withdraw : ");
					double withdrawAmount = sc.nextDouble();
					atm.withdraw(person.getTotalFundsAvailable(), withdrawAmount);

				}
				if (action.equalsIgnoreCase("balance")) {
					atm.viewBalance(person.getTotalFundsAvailable());

				}

			}

			else {
				System.out.println("Incorrect pin");
			  }
	    }
			
  }
	

	
	
	
	
		


