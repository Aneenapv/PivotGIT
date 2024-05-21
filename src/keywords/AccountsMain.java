package keywords;

public class AccountsMain {

	public static void main(String[] args) {
		
		Accounts account1 = new Accounts("12345 ", "jerin ", 1000);
		//account1.accountName = " ravneeth ";
		//account1.balance = 3000;
		System.out.println("account details: "+account1.accountName
				+ account1.accountNumber + account1.balance);
		
		Accounts account2 = new Accounts("098767 ", "emil ", 1500);
		//account2.accountName = " aneena ";
		//account2.balance = 2000;
		System.out.println("account details: "+account2.accountName
				+ account2.accountNumber + account2.balance);

		
	}

}
