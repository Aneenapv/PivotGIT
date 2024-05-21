package abstractionPractice;

public  class Bear extends  AnimalAbstractClass   {

	

	public Bear(int speed, int legsCount) 
	{
		super(speed, legsCount);
	}

	@Override
	public void eating() {
		
		System.out.println("bear eating:speed "+speed);
	}
	
//	public void sleeping()
//	{
//		System.out.println("bear is sleeping");
//	}
	

}
