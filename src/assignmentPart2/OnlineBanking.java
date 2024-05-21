package assignmentPart2;
import java.util.*;
import assignmentPart1.PersonsAccountDetails;
public  class OnlineBanking extends BankOperations{
	
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
			}
		
	      }
			System.out.println("for your reference current password = "+person.getOnlineBankingPassword());
			System.out.println("Enter your Password: ");
			   String passwordEntered = sc.next();
			 
			  if( person.validatePassword(passwordEntered) )
			     {
				  
				  System.out.println("password is correct");
				  System.out.println("Account number =" +person.getBankAccountNumber());
		    	  System.out.println("Account holder name =" +person.getNameOfAccountHolder());
				  System.out.println("Deposit | withdraw | balance : please select your option");
				  String action = sc.next();
				  
				  OnlineBanking online = new OnlineBanking();
				
				  
				  if(action.equalsIgnoreCase("deposit"))
				  {
						System.out.println("deposit your cash");
		    			System.out.println("Enter amount to deposit: ");
		    			double depositAmount = sc.nextDouble();
		    			online.deposit(person.getTotalFundsAvailable(), depositAmount);
				  }
				  if(action.equalsIgnoreCase("withdraw"))
				  {
						System.out.println("withdraw your cash");
						System.out.println("Enter amount to withdraw : ");
						double withdrawAmount = sc.nextDouble();
						online.withdraw(person.getTotalFundsAvailable(),withdrawAmount);
				  }
				  
				  if(action.equalsIgnoreCase("balance"))
				  {
					  online.viewBalance(person.getTotalFundsAvailable());
					
				  }
				  
		      }
			  else
			  {
				  System.out.println("Incorrect password");
			  }
}
}
}
