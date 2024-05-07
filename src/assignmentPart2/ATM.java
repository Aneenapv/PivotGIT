package assignmentPart2;

import java.util.*;

public class ATM extends BankOperations{
	
	 private String oldPin;
	//private String newPin;

	 
	public ATM(String oldPin) {
		super();
		this.oldPin = oldPin;
	}

	Scanner sc = new Scanner(System.in);

	
	@Override
	public void changePinPassword()
	{
		System.out.println("Please update your pin");
		System.out.println("Enter your new pin to update: ");
		String newPin = sc.nextLine();
		
		
		if(newPin.equals(oldPin))
		{
			System.out.println("Please provide different pin not same as old pin");	
		}
		else
		{
			if(newPin.length()<4)
			{
				System.out.println("Pin should be 4 characters");
			}
			else
			{
			System.out.println("Pin successfully updated");
			System.out.println("new pin = "+newPin);
		    }
			
	
	}

	}	
}
		


