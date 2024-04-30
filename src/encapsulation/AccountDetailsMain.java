package encapsulation;

public class AccountDetailsMain {

	public static void main(String[] args) {
		
  AccountDetails account = new AccountDetails("123456789", 3456, 5005.8);
   
  System.out.println("Account Number : " +account.getAccountNumber(3456));
  
      account.setPinNumber(3756);
      
      account.setNewPin(3756, 3756);
      
      account.setBalance(2519.35, 3756);
      
      System.out.println("balance= "+account.getBalance());
      
    
 
  
	}

}
