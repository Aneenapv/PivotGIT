package assignmentPart1;

public class PersonsAccountDetails {
	
	
	 String bankAccountNumber;
	 String nameOfAccountHolder;
	 double totalFundsAvailable;
	 

	private int pin;
	 private String onlineBankingPassword;
		
		
	 public PersonsAccountDetails(String bankAccountNumber, String nameOfAccountHolder, double totalFundsAvailable) 
	    {
			super();
			this.bankAccountNumber = bankAccountNumber;
			this.nameOfAccountHolder = nameOfAccountHolder;
			this.totalFundsAvailable = totalFundsAvailable;
	
	     }
	 
	 


	public int getPin() {
		return pin;
	}


	public void setPin(int pin) {
		this.pin = pin;
	}
	
	public boolean validatePin(int pinEntered)
	{
		if(pin==pinEntered)
		{
			return true;
		}
		return false;
	}


	public String getOnlineBankingPassword() {
		return onlineBankingPassword;
	}


	public void setOnlineBankingPassword(String onlineBankingPassword) {
		this.onlineBankingPassword = onlineBankingPassword;
	}
	
	public boolean validatePassword(String passwordEntered)
	{
		if(onlineBankingPassword.equals(passwordEntered))
		{
			return true;
		}
		return false;
	}
	
	

}
