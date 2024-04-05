package Atm;

public class AtmTransaction {

	
	int storedPin;
	int enteredPin;
	double accountBalance;
	int withdrawalAmount;
	int overdraftAmount;
	
	
	void pinVerification()
	{
		Boolean isPinCorrect = (storedPin == enteredPin);
		if(isPinCorrect)
		{
			System.out.println("Pin Verified Successfully");
			Boolean isEligibleForTransaction =(accountBalance>withdrawalAmount) || (overdraftAmount>withdrawalAmount);
			if(isEligibleForTransaction)
			{
				System.out.println("You can withdraw");
			}
			else
			{
				System.out.println("You cannot withdraw money");
			}
		}
		else
		{
			System.out.println("Incorrect pin");
		}
	}
	
}
