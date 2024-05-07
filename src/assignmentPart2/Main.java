package assignmentPart2;

public class Main {

	public static void main(String[] args) {
	
		BankOperations atmbank = new ATM("1020");
		atmbank.changePinPassword();
		
		BankOperations onlinebank = new OnlineBanking("qwertyuiop$");
		onlinebank.changePinPassword();
	}

}
