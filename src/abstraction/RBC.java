package abstraction;

public class RBC implements NBankInterface,CRA{

	@Override
	public void provideLoans() {
		
		System.out.println("provide loans  at 5.7%");
	}

	@Override
	public void interestOnSaving() {
	 System.out.println("provide 1% interest on saving");
		
	}

	@Override
	public void provideCheques() {
		
		System.out.println("provide 3 cheques");
	}

	@Override
	public void linkAccountWithSIN() {
		System.out.println("Accounts linked to SIN");
		
	}

	@Override
	public void provideTfsa() {
		System.out.println("TFSA account");
		
	}

}
