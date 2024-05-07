package assignmentPart3;
import java.util.*;
public class ATM extends BankingRules implements BankOperations
{
	
	int dailyWithdrawalLimit = 2000;
	//int numberOfTransactions = 3;
	//int numberOfTimesPinEntered = 3;
	double balanceAvailable = 5000;
	int oldPin = 1020;
	int pinAttempts=0;

	Scanner sc = new Scanner(System.in);
	
	
	@Override
	public void changePinPassword() {
		for(int i=0;i<=3;i++)
		{
			System.out.println("Enter your current pin: ");
			int currentPin = sc.nextInt();
			if(currentPin==oldPin)
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
				if(!(currentPin==oldPin))
				{
					pinAttempts++;
					System.out.println("Pin is Incorrect");
					System.out.println("do you want to exit or continue :");
					String exitContinue = sc.next();
					if(exitContinue.equalsIgnoreCase("exit"))
					{
						break;
					}
					else if(exitContinue.equalsIgnoreCase("continue"))
					{
					if(pinAttempts>=3)
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
