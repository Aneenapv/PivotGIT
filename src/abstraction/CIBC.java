package abstraction;

public class CIBC extends NationalBank implements Brokerage, ForexTransactions {

	@Override
	public void interestOnSaving() {
		System.out.println("provide interest of 1% on saving");
		
	}
	
	public void provideLoans()
	{
		System.out.println("provide loans starting from prime rate 5.5%");
	}

	@Override
	public void buyStocks() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sellStocks() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void chargeForEachTransaction() {
		System.out.println("charge for each transaction is $4.95");
		
	}

	@Override
	public void sendMoneyGlobally() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void receiveMoneyGlobally() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void provideCheques() {
		System.out.println("CIBC bank provides 5 cheques");
		
	}
	

}
