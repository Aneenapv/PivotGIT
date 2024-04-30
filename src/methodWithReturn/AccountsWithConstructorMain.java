package methodWithReturn;

public class AccountsWithConstructorMain {

	public static void main(String[] args) {
		
		AccountsWithConstructor acManvir = new AccountsWithConstructor("Manvir-Account", "Chequing", "123456", 3500.5, 1111);

		AccountsWithConstructor acSaroop = new AccountsWithConstructor("Saroop-Account", "Chequing", "123457", 4500.5, 2222);

		AccountsWithConstructor acKetaki = new AccountsWithConstructor("Ketaki-Account", "Chequing", "123458", 5500.5, 3333);
		
		System.out.println("Manvir Account Details = "+acManvir.getAccountName());
		System.out.println("Saroop Account Details = "+acSaroop.getAccountName());
		System.out.println("Ketaki Account Details = "+acKetaki.getAccountName());
		
		System.out.println("Manvir trial = "+acManvir.accountName);
		
		
		
		// not assigned parameters in constructor main page. so that we get null
		AccountsWithConstructor ac1 = new AccountsWithConstructor();
		System.out.println(" ac1 = "+ac1.accountName);
		
		
	}

}
