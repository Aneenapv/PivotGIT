package abstractionPractice;

public abstract class AnimalAbstractClass {
	// abstract variables can be private, protected, public, default, 
	//final with initialize value , static are allowed
	
    int speed;
	int legsCount;
	
	// abstract class can create constructors
	public AnimalAbstractClass(int speed, int legsCount) {
		super();
		this.speed = speed;
		this.legsCount = legsCount;
	}

	public abstract void eating();
	
	public void sleeping()
	{
		System.out.println("Animal is sleeping:legcount: "+legsCount);
	}

}
