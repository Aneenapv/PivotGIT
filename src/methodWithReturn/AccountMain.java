package methodWithReturn;
import java.util.*;
public class AccountMain {

	public static void main(String[] args) {

		Account jerinAccount = new Account();

		jerinAccount.nameOfAccountHolder = "JERIN RAJ";
		jerinAccount.accountType = "chequing";
		jerinAccount.accountNumber = "123456789";
		jerinAccount.balance = 5500.5;
		jerinAccount.pin = 1298;

		// String accountNumberOfJerin = jerinAccount.getAccountNumber();
		// System.out.println("jerin account number = "+accountNumberOfJerin);

		// or
		System.out.println("jerin account number = " + jerinAccount.getAccountNumber());

		Account ravneetAccount = new Account();

		ravneetAccount.nameOfAccountHolder = "RAVNEET KAUR";
		ravneetAccount.accountType = "savings";
		ravneetAccount.accountNumber = "123456788";
		ravneetAccount.balance = 7500.5;
		ravneetAccount.pin = 1199;
		

		Account gurleenAccount = new Account();

		gurleenAccount.nameOfAccountHolder = "GURLEEN KAUR";
		gurleenAccount.accountType = "chequing";
		gurleenAccount.accountNumber = "123456777";
		gurleenAccount.balance = 3500.5;
		gurleenAccount.pin = 2299;
		
		
		String[] names = {"JERIN RAJ","RAVNEET KAUR","GURLEEN KAUR"};
		Account[] accounts = {jerinAccount,ravneetAccount,gurleenAccount};
		
		//balance of jerin account
		
		System.out.println("jerin account balance = "+accounts[0].getBalance());

		System.out.println("ravneet account balance = "+accounts[1].getBalance());

		System.out.println("gurleen account balance = "+accounts[2].getBalance());
		
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Enter your account nuumber : ");
		String enteredAccountNumber = sc.next();
		System.out.println("Enter your pin number : ");
		int pinEntered = sc.nextInt();
		
//		for(int i=0;i<accounts.length; i++)
//		{
//			if(accounts[i].getAccountNumber().equals(enteredAccountNumber))
//			{
//				if(accounts[i].getPin()==pinEntered)
//				{
//				System.out.println("Name of account holder = "+accounts[i].getNameOfAccountHolder());
//				System.out.println("Type of account = "+accounts[i].getAccountType());
//				System.out.println("Balance = "+accounts[i].getBalance());
//				break;
//			    }
//				else
//				{
//					System.out.println("Incorrect pin");
//				}
//				
//		  }
//		
//	}
		
//		for(int i=0;i<accounts.length; i++)
//		{
//			if(accounts[i].getAccountNumber().equals(enteredAccountNumber))
//			{
//				boolean isPinValid = accounts[i].validatePin(pinEntered);
//				
//				if(isPinValid)
//				{
//				System.out.println("Name of account holder = "+accounts[i].getNameOfAccountHolder());
//				System.out.println("Type of account = "+accounts[i].getAccountType());
//				System.out.println("Balance = "+accounts[i].getBalance());
//			    }
//				else
//				{
//					System.out.println("Incorrect pin");
//				}
//				break;
//				
//		  }
//		}
		
		boolean isAccountValidated = false;
//		for(int i=0;i<accounts.length;i++)
//		{
//			if(accounts[i].validateCredentials(enteredAccountNumber, pinEntered))
//			{
//				System.out.println("Name of account holder = "+accounts[i].getNameOfAccountHolder());
//				System.out.println("Type of account = "+accounts[i].getAccountType());
//				System.out.println("Balance = "+accounts[i].getBalance());
//				 isAccountValidated = true;
//			    break;
//			}
//		}
//			if(! isAccountValidated)
//			{
//				System.out.println("Account details are not correct");
//			}
		
		
//		Account account = new Account();
//		account = account.getAccountIfValidCredentials(enteredAccountNumber, pinEntered, accounts);
//		System.out.println("Name of account holder = "+account.getNameOfAccountHolder());
//		System.out.println("Type of account = "+account.getAccountType());
//		System.out.println("Balance = "+account.getBalance());
//		System.out.println("pin number = "+account.getPin());
		
		
		
//		Account account = new Account();
//		account= account.getAccountIfValidCredentials(enteredAccountNumber, pinEntered, accounts);
//		account.displayAccountDetails(account);
	
	
		
		Account account = new Account();
		account= account.getAccountIfValidCredentials(enteredAccountNumber, pinEntered, accounts);
		account.displayAccountDetails();
		gurleenAccount.displayAccountDetails();
		
		
		// java will assign null value as default 
		Account account1 = new Account();
		account1.displayAccountDetails();
		
		
		
}
}
