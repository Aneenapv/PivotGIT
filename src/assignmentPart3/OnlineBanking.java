package assignmentPart3;

import java.util.Scanner;

public class OnlineBanking extends BankingRules {
	
	

	int dailyWithdrawalLimit = 2000;
	double balanceAvailable = 5000;
	String oldPassword = "qwerty";
	int passwordAttempts=0;

	Scanner sc = new Scanner(System.in);
	
	
	@Override
	public void changePinPassword() {
		for(int i=0;i<=3;i++)
		{
			System.out.println("Enter your current password: ");
			String currentPassword = sc.next();
			if(currentPassword.equals(oldPassword))
			{
					System.out.println("what type of Transaction you want: Deposit or Withdraw");
					String transaction = sc.next();
					
					if(transaction.equalsIgnoreCase("deposit"))
					{
						System.out.println("Enter your amount to deposit: ");
						double depositAmount =  sc.nextDouble();
						double totalBalance = (depositAmount+balanceAvailable);
						System.out.println("Balance after deposit = "+totalBalance );
						break;
					}
					if(transaction.equalsIgnoreCase("withdraw"))
					{
						System.out.println("Enter your amount to withdraw: ");
						double withdrawAmount =  sc.nextDouble();
						if((withdrawAmount<balanceAvailable) && (withdrawAmount<=dailyWithdrawalLimit))
						{
						double totalBalance = (balanceAvailable-withdrawAmount);
						System.out.println("Balance after deposit = "+totalBalance );
					    }
						else
						{
							System.out.println("Not sufficient fund available to withdraw");
						}
						break;
				    }
				}
			
			else
			{
				if(!(currentPassword==oldPassword))
				{
					passwordAttempts++;
					if(passwordAttempts>=3)
					{
						System.out.println("Account locked");
						 System.exit(0);
					}
					System.out.println("Password is Incorrect");
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
