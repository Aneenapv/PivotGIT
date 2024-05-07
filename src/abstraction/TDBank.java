package abstraction;

public class TDBank extends NationalBank {

	@Override
	public void interestOnSaving() {
		System.out.println("provide interest of 1.2% on saving");
		
	}
	
//	public void provideLoans()
//	{
//		System.out.println("provide loans starting from prime rate 5.2%");
//	}

	@Override
	public void provideCheques() {
		System.out.println("td bank provides 10 cheques");
		
	}
	

}
