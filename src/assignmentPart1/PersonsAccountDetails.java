package assignmentPart1;

public final class PersonsAccountDetails {
	
	
	 private String bankAccountNumber;
	 private  String nameOfAccountHolder;
	 private double totalFundsAvailable;
	 

	 private String pin="1020";
	 private String onlineBankingPassword= "qwerty";
		
		
	 public String getBankAccountNumber() {
		return bankAccountNumber;
	}


	public String getNameOfAccountHolder() {
		return nameOfAccountHolder;
	}


	public double getTotalFundsAvailable() {
		return totalFundsAvailable;
	}


	public PersonsAccountDetails(String bankAccountNumber, String nameOfAccountHolder, double totalFundsAvailable) 
	    {
			super();
			this.bankAccountNumber = bankAccountNumber;
			this.nameOfAccountHolder = nameOfAccountHolder;
			this.totalFundsAvailable = totalFundsAvailable;
	
	     }
	 
	 
	public String getPin() {
		return pin;
	}
	
	public void setPin(String newPin) {
		this.pin = newPin;
	}
	
	public boolean validatePin(String pinEntered)
	{
		if((this.pin).equals(pinEntered))
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
		if(this.onlineBankingPassword.equals(passwordEntered))
		{
			return true;
		}
		return false;
	}


	
	
	

}
