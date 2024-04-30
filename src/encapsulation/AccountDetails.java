package encapsulation;

public class AccountDetails {
	
	private String accountNumber;
	private int pinNumber;
	private double balance;
	
	public AccountDetails(String accountNumber, int pinNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.pinNumber = pinNumber;
		this.balance = balance;
	}
	
//getter and setter
	
		public String getAccountNumber(int pinEntered)
		{
			if(validatePin(pinEntered))
			{
			return accountNumber;
		    }
			return "";
		}
		
		public double getBalance()
		   {
			return balance;
			}
	
	     
		
		public void setPinNumber(int pinNumber)
		{
			this.pinNumber=pinNumber;
			System.out.println("new pin : "+pinNumber);
		}
		
		
		public void setNewPin(int pinNumber, int pinEntered)
		{
			if(validatePin(pinEntered))
			{
				this.pinNumber=pinNumber;
				System.out.println("pin is correct");
				System.out.println("current pin:" +pinNumber);
			}
			else
			{
				System.out.println("pin is not correct");
			}
		}
		
		public void setBalance(double balance, int pinEntered)
		{
			if(validatePin(pinEntered))
			{
			this.balance=balance;
			System.out.println("new balance="+balance);
			}
			else
			{
				System.out.println("pin is incorrect");
			}
		}
		
		public boolean validatePin(int pinEntered)
		{
			if(pinNumber==pinEntered)
			{
				return true;
			}
			return false;
		}
	}

	

