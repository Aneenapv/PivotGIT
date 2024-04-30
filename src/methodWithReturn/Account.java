package methodWithReturn;

public class Account {
	
	String nameOfAccountHolder;
	String accountType;
	String accountNumber;
	double balance;
	int pin;
	
	public String getNameOfAccountHolder()
	{
		return nameOfAccountHolder;
	}

	public double getBalance()
	{
		return balance;
	}
	
	public String getAccountNumber()
	{
		return accountNumber;
	}
	
	public String getAccountType()
	{
		return accountType;
	}
	
	public int getPin()
	{
		return pin;
	}
	
	public boolean validatePin(int pinEntered)
	{
		if(pin==pinEntered)
		{
			return true;
		}
		return false;
	}
	public boolean validateCredentials(String enteredAccountNumber, int pinEntered)
	{
		if(accountNumber.equals(enteredAccountNumber))
		{
			if(validatePin(pinEntered))
			{
				return true;
			}
		}
		return false;
	}
	
	public Account getAccountIfValidCredentials(String enteredAccountNumber, int pinEntered, Account[] accounts)
	{
		for(int i=0;i<accounts.length;i++)
		{
		if(accounts[i].getAccountNumber().equals(enteredAccountNumber))
		{
			if(accounts[i].getPin()==pinEntered)
			{
				return accounts[i];
			}
	     }
        }
		return null;
	}
	
	public void displayAccountDetails(Account account)
	{
		System.out.println("Name of account holder = "+account.getNameOfAccountHolder());
		System.out.println("Type of account = "+account.getAccountType());
		System.out.println("Balance = "+account.getBalance());
		System.out.println("pin number = "+account.getPin());
	}
	
	public void displayAccountDetails()
	{
		System.out.println("Name of account holder = "+getNameOfAccountHolder());
		System.out.println("Type of account = "+getAccountType());
		System.out.println("Balance = "+getBalance());
		System.out.println("pin number = "+getPin());
	}
}
