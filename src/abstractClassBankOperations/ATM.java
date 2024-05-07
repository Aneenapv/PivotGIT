package abstractClassBankOperations;

public class ATM extends BankOperations{
	
	private String pin;
	
	@Override
	public void changePinPassword()
	{
		System.out.println("ATM: update pin");
		
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pinEntered) {
		if(pinEntered.equals(pin))
		{
		this.pin = pin;
		
	    }

}
}
