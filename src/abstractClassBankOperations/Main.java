package abstractClassBankOperations;

public class Main {

	public static void main(String[] args) {
	
		BankOperations atmbank = new ATM();
		atmbank.changePinPassword();
		
		BankOperations onlinebank = new OnlineBanking();
		onlinebank.changePinPassword();
	}

}
