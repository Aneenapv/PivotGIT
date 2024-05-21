package assignmentPart1;

import java.util.Scanner;

public class OnlineBanking extends BankOperations{
	
	Scanner sc = new Scanner(System.in);
	
	PersonsAccountDetails person = new PersonsAccountDetails("123456", "Aneena", 3250.50);

	BankOperations bank= new BankOperations();
	
	  public void transaction()
	  {
	   System.out.println("Enter your Password: ");
	   String passwordEntered = sc.next();
	 
	  if( person.validatePassword(passwordEntered) )
	     {
		  
		  System.out.println("password is correct");
		  System.out.println("Account number =" +person.getBankAccountNumber());
    	  System.out.println("Account holder name =" +person.getNameOfAccountHolder());
		  System.out.println("Deposit | withdraw | balance : please select your option");
		  String action = sc.next();
		  
		 // BankOperations online = new OnlineBanking();
		
		  
		  if(action.equalsIgnoreCase("deposit"))
		  {
				System.out.println("deposit your cash");
    			System.out.println("Enter amount to deposit: ");
    			double depositAmount = sc.nextDouble();
    			bank.deposit(person.getTotalFundsAvailable(), depositAmount);
		  }
		  if(action.equalsIgnoreCase("withdraw"))
		  {
				System.out.println("withdraw your cash");
				System.out.println("Enter amount to withdraw : ");
				double withdrawAmount = sc.nextDouble();
				bank.withdraw(person.getTotalFundsAvailable(),withdrawAmount);
		  }
		  
		  if(action.equalsIgnoreCase("balance"))
		  {
			  bank.viewBalance(person.getTotalFundsAvailable());
			
		  }
		  
      }
	  else
	  {
		  System.out.println("Incorrect password");
	  }
}


}
