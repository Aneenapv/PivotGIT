package assignmentPart2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
      Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Type of service: ATM or Online Banking : ");
		String typeOfService = sc.next();

		if (typeOfService.equalsIgnoreCase("ATM")) {
		BankOperations atmbank = new ATM();
		 atmbank.changePinPassword();
		}
		

	    if(typeOfService.equalsIgnoreCase("OnlineBanking"))
	   {
		BankOperations onlinebank = new OnlineBanking();
		onlinebank.changePinPassword();
	}

}
}
