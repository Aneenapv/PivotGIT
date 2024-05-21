package assignmentPart3Trial;

	import java.util.*;
	
	import assignmentPart1.PersonsAccountDetails;
	
	public  class OnlineBanking extends BankingRules implements BankOperations{
		
		
		final int dailyWithdrawalLimit = 2000;
		final int numberOfTransactions = 3;
		final int numberOfTimesPasswordEntered = 3;
		
		//double balanceAvailable = 5000;
		//int oldPin = 1020;
		int passwordAttempts=0;

		
		   Scanner sc =new Scanner(System.in);
		   
		   PersonsAccountDetails person = new PersonsAccountDetails("123456", "Aneena", 3250.50);
		    

		@Override
		public void changePinPassword()
		{
			System.out.println("Please update your passwword");
			System.out.println("Enter your new password to update: ");
			String newPassword = sc.nextLine();
			
			
			if(newPassword .equals(person.getOnlineBankingPassword()))
			{
				System.out.println("Please provide different password not same as old password");
				System.exit(0);
			}
			else
			{
				
	/* Password is not same as old password
	One should not be allowed to set password 
	if it is less than 8 characters
	 and have these special characters (&,$, @) */
				
	 
				if(newPassword.length()<8)
				{
					System.out.println("Password should be 8 characters");
					System.exit(0);
				}
				else
				{
				if((newPassword.contains("@")) || (newPassword.contains("$")) || (newPassword.contains("&")))
				{	
				System.out.println("Password successfully updated");
				person.setOnlineBankingPassword(newPassword);
			    }
				else
				{
					System.out.println("please include special characters @ $ &");
					System.exit(0);
				}
			
		      }
			}
		}
		
				@Override
				public void transaction()
				{
				System.out.println("for your reference current password = "+person.getOnlineBankingPassword());
				for(int i=0;i<=numberOfTransactions;i++)
				{
					System.out.println("Enter your current password: ");
					String currentPassword = sc.next();
					if(currentPassword.equals(person.getOnlineBankingPassword()))
					{
						    System.out.println("Pin is correct");
						    System.out.println("Account number =" + person.getBankAccountNumber());
							System.out.println("Account holder name =" + person.getNameOfAccountHolder());
							System.out.println("what type of Transaction you want: Deposit or Withdraw or viewbalance");
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
								if((withdrawAmount<person.getTotalFundsAvailable()) && (withdrawAmount<=dailyWithdrawalLimit)&&(withdrawAmount>0))
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
					
					else
					{
						if(!(currentPassword.equals(person.getOnlineBankingPassword())))
						{
							passwordAttempts++;
							System.out.println("Password is Incorrect");
							System.out.println("do you want to exit or continue :");
							String exitContinue = sc.next();
							if(exitContinue.equalsIgnoreCase("exit"))
							{
								break;
							}
							else if(exitContinue.equalsIgnoreCase("continue"))
							{
						
							if(passwordAttempts>=numberOfTimesPasswordEntered)
							{
								System.out.println("Account locked");
								 System.exit(0);
							}
					
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


