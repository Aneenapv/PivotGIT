package assignmentPart1;

import java.util.*;

public class Main {

	public static void main(String[] args) {
/* User should be allowed to perform only single operation (deposit cash,withdraw cash etc) 
For every transaction, user must have to enter pin or banking password and
 that pin must be validated before allowing the transaction. 

Action that user intends to do (Like deposit cash or withdraw) must be asked after validating the pin. 
Initial user deposit can be kept as constant value.


User should be given Information after every transaction on the amount of balance left in account. */
		
		PersonsAccountDetails person = new PersonsAccountDetails("123456", "Aneena", 3250.50);
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Type of service: ATM or Online Banking : ");
        String typeOfService = sc.next();
        
        
       if(typeOfService.equalsIgnoreCase("ATM"))
       {
    	   System.out.println("Enter your Pin: ");
    	   int pinEntered = sc.nextInt();
    	   person.setPin(3040);
    	   person.getPin();
    	  if( person.validatePin(pinEntered) )
    	     {
    		  System.out.println("pin is correct");
    		  System.out.println("Account number =" +person.bankAccountNumber);
        	  System.out.println("Account holder name =" +person.nameOfAccountHolder);
    		  System.out.println("Deposit or withdraw or balance : select your option");
    		  String action = sc.next();
    		  
    		  BankOperations atm = new ATM();
    		  
    		  if(action.equalsIgnoreCase("deposit"))
    		  {
    			System.out.println("deposit your cash");
    			System.out.println("Enter amount to deposit: ");
    			double depositAmount = sc.nextDouble();
    			atm.deposit(person.totalFundsAvailable, depositAmount);
    		  }
    		  if(action.equalsIgnoreCase("withdraw"))
    		  {
    			System.out.println("withdraw your cash");
  				System.out.println("Enter amount to withdraw : ");
  				double withdrawAmount = sc.nextDouble();
  				atm.withdraw(person.totalFundsAvailable,withdrawAmount);
    			
    		  }
    		  if(action.equalsIgnoreCase("balance"))
    		  {
    			  atm.viewBalance(person.totalFundsAvailable);
    			
    		  }
    		  
            }
    	  
    	  else
    	  {
    		  System.out.println("Incorrect pin");
    	  }
       }
    	  
       
       
       else if(typeOfService.equalsIgnoreCase("OnlineBanking"))
       {
    	   System.out.println("Enter your Password: ");
    	   String passwordEntered = sc.next();
    	   person.setOnlineBankingPassword("qwerty");
    	   person.getOnlineBankingPassword();
    	  if( person.validatePassword(passwordEntered) )
    	     {
    		  
    		  System.out.println("password is correct");
    		  System.out.println("Account number =" +person.bankAccountNumber);
        	  System.out.println("Account holder name =" +person.nameOfAccountHolder);
    		  System.out.println("Deposit withdraw balance : select your option");
    		  String action = sc.next();
    		  
    		  BankOperations online = new OnlineBanking();
    		  
    		  if(action.equalsIgnoreCase("deposit"))
    		  {
    				System.out.println("deposit your cash");
        			System.out.println("Enter amount to deposit: ");
        			double depositAmount = sc.nextDouble();
    			  online.deposit(person.totalFundsAvailable, depositAmount);
    		  }
    		  if(action.equalsIgnoreCase("withdraw"))
    		  {
    				System.out.println("withdraw your cash");
    				System.out.println("Enter amount to withdraw : ");
    				double withdrawAmount = sc.nextDouble();
    				online.withdraw(person.totalFundsAvailable,withdrawAmount);
    		  }
    		  
    		  if(action.equalsIgnoreCase("balance"))
    		  {
    			  online.viewBalance(person.totalFundsAvailable);
    			
    		  }
    		  
    		
    	  
          }
    	  else
    	  {
    		  System.out.println("Incorrect password");
    	  }
	}

}
}
