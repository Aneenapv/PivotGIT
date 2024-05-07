package assignmentPart3;
import java.util.*;
public class Main {

public static void main(String[] args) {
		
   Scanner sc = new Scanner(System.in);
   System.out.println("Banking Service : ATM or OnlineBanking");
   String service = sc.nextLine();
   
   ATM atm = new ATM();
   OnlineBanking online = new OnlineBanking();
   
   if(service.equalsIgnoreCase("ATM"))
   {
	   atm.changePinPassword();
   }
   if(service.equalsIgnoreCase("OnlineBanking"))
   {
	   online.changePinPassword();
   }
   
	}

}
