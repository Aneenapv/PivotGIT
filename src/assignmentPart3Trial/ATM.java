package assignmentPart3Trial;

import java.util.*;

import assignmentPart1.PersonsAccountDetails;

public class ATM extends BankingRules implements BankOperations{
	
	final int dailyWithdrawalLimit = 2000;
	final int numberOfTransactions = 3;
	final int numberOfTimesPinEntered = 3;
	//double balanceAvailable = 5000;
	//int oldPin = 1020;
	int pinAttempts=0;

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
					System.exit(0);
				}
				else
				{
				System.out.println("Pin updated successfully");
				person.setPin(newPin);
			    }
			}
		}
			@Override
				public void transaction()
				{
			    System.out.println("for your reference current pin = "+person.getPin());
			    for(int i=0;i<=numberOfTransactions;i++)
				{
					System.out.println("Enter your current pin: ");
					String currentPin = sc.next();
					if(currentPin.equals(person.getPin()))
					{
						    System.out.println("Pin is correct");
							System.out.println("Account number =" + person.getBankAccountNumber());
							System.out.println("Account holder name =" + person.getNameOfAccountHolder());
							System.out.println("what type of Transaction you want: Deposit or Withdraw or ViewBalance");
							String transaction = sc.next();
							
							if(transaction.equalsIgnoreCase("deposit"))
							{
								System.out.println("Enter your amount to deposit: ");
								double depositAmount =  sc.nextDouble();
								if(depositAmount>0)
								{
								double totalBalance = (depositAmount+person.getTotalFundsAvailable());
								System.out.println("Balance after deposit = "+totalBalance );
								break;
								}
								else
								{
									System.out.println("Invalid deposit Amount");
									break;
								}
							}
							if(transaction.equalsIgnoreCase("withdraw"))
							{
								System.out.println("Enter your amount to withdraw: ");
								double withdrawAmount =  sc.nextDouble();
					
								if((withdrawAmount<person.getTotalFundsAvailable()) && (withdrawAmount<=dailyWithdrawalLimit) &&(withdrawAmount>0))
								{
								double totalBalance = (person.getTotalFundsAvailable()-withdrawAmount);
								System.out.println("Balance after deposit = "+totalBalance );
								break;
							    }
								else
								{
									System.out.println("Not sufficient fund available to withdraw or entered above daily withdrawal limit or Invalid Amount");
									break;
								}
								
						    }
							if(transaction.equalsIgnoreCase("viewbalance"))
							{
								System.out.println("Balance = " +person.getTotalFundsAvailable());
								break;
							}
						}
					
					else if(!(currentPin.equals(person.getPin())))
						{
							pinAttempts++;
							System.out.println("Pin is Incorrect");
							System.out.println("do you want to exit or continue :");
							String exitContinue = sc.next();
							if(exitContinue.equalsIgnoreCase("exit"))
							{
								break;
							}
						   if(exitContinue.equalsIgnoreCase("continue"))
							{
							if(pinAttempts>=numberOfTimesPinEntered)
							{
								System.out.println("Account locked");
								 break;
							}
							
							}
						}
					
					}
				}

		@Override
		public void dailyWithdrawalLimit() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void numberOfTransactions() {
			// TODO Auto-generated method stub
			
		}		
		
}
