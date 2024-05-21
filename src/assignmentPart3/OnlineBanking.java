package assignmentPart3;

import java.util.Scanner;

public class OnlineBanking extends BankingRules implements BankOperations 
{
	
	final int dailyWithdrawalLimit = 2000;
	final int numberOfTransactions = 3;
	final int numberOfTimesPasswordEntered = 3;
	double balanceAvailable = 5000;
	String oldPassword = "qwerty";
	int passwordAttempts=0;

	Scanner sc = new Scanner(System.in);
	
	
	@Override
	public void changePinPassword() {
		for(int i=0;i<=numberOfTransactions;i++)
		{
			System.out.println("Enter your current password: ");
			String currentPassword = sc.next();
			if(currentPassword.equals(oldPassword))
			{
				    System.out.println("Pin is correct");
					System.out.println("what type of Transaction you want: Deposit or Withdraw");
					String transaction = sc.next();
					
					if(transaction.equalsIgnoreCase("deposit"))
					{
						System.out.println("Enter your amount to deposit: ");
						double depositAmount =  sc.nextDouble();
						if(depositAmount>0)
						{
						double totalBalance = (depositAmount+balanceAvailable);
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
						if((withdrawAmount<balanceAvailable) && (withdrawAmount<=dailyWithdrawalLimit)&&(withdrawAmount>0))
						{
						double totalBalance = (balanceAvailable-withdrawAmount);
						System.out.println("Balance after deposit = "+totalBalance );
					    }
						else
						{
							System.out.println("Not sufficient fund available to withdraw or entered above daily withdrawal limit or Invalid Amount");
						}
						break;
				    }
				}
			
			else
			{
				if(!(currentPassword==oldPassword))
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
	public void dailyWithdrawalLimitAllowed() {
		
		
	}

	@Override
	public void numberOfTransactionAllowed() {
		
		
	}

}
