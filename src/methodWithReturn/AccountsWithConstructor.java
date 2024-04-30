package methodWithReturn;

public class AccountsWithConstructor {
	
	String accountName;
	String accountType;
	String accountNumber;
	double balance;
	int    pin;
	
	public AccountsWithConstructor(String accountName, String accountType, String accountNumber, double balance,
			int pin) {
		super();
		this.accountName = accountName;
		this.accountType = accountType;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.pin = pin;
	}
	

	public AccountsWithConstructor(String accountName, String accountNumber, double balance) {
		super();
		this.accountName = accountName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}


	public AccountsWithConstructor()
	{
		
	}
	
	// Methods
	
	public String getAccountName()
	{
		return accountName;
	}

	public String getAccountType()
	{
		return accountType;
	}
	
	public String getAccountNumber()
	{
		return accountNumber;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public int getPin()
	{
		return pin;
	}
}
