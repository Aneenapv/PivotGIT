package finalPackage;

public final class FinalClass extends Final1 implements FinalInterface{
	
	final String name = "aneena";
	
	
	final public void deposit()
	{
		System.out.println("deposit aneena - final class");
	}
   
	public void deposit(int a,int b)
	{
		System.out.println("deposit overload = "+(a+b));
	}

	@Override
	public void balance() {
		// TODO Auto-generated method stub
		
	}
}
