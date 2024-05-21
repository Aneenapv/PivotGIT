package assignmentPart1;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Type of service: ATM or Online Banking : ");
		String typeOfService = sc.next();

		if (typeOfService.equalsIgnoreCase("ATM")) {
			ATM atm= new ATM();
			atm.transaction();
			
		}
		

	    if(typeOfService.equalsIgnoreCase("OnlineBanking"))
	   {
	    	OnlineBanking online = new OnlineBanking();
	    	online.transaction();
	    }
}
}
