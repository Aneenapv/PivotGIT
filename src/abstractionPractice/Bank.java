package abstractionPractice;

public interface Bank {
	
	public void method1();
	
	//private void method2(); not allowed
	
	//protected void method3(); not allowed
	
	void method4();  // by default methods are public in interface
	
	
	// In Interface we can create methods having body after java 8 version
	// But only default and static methods have body
    default void method5()
	{
		System.out.println("default method in bank interface");
	}
    
    static void method6()
    {
    	System.out.println("static method in bank interface");
    }
	// In Interface abstract methods do not specify body 
//    public void method7()
//    {
//    	
//    }
	

}
