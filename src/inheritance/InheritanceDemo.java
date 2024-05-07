package inheritance;

public class InheritanceDemo {
	
	public static void main(String[] args) {
		
	final class ABC
	{
		public void mABC()
		{
			
		}
	}
	
	class A    //parent class
	{
		public void m1()
		{
			
		}
	}
	
	class B
	{
		public void m2()
		{
			 A aObj = new A();   // HAS A RELATIONSHIP  B class has A class object 
			 
			 aObj.m1();
		}
	}
	
	
	//parent class automatically provides all the variables and methods to child class
	//always parent to child.. unidirectional... not from child to parent.
	//keyword extends
	//private method in parent class only visible in parent class. not accessible in child class
	// final class cannot be inherited
	
	//class C is child and class A is parent
	class C extends A
	{
		public void m3()
		{
		m1();   // IS A RELATIONSHIP	//inheritance created using extends
		}
	}
	
//	class D extends ABC
//	{
//		// its not possible because of final word in class ABC
//	}
	
	// class with final keyword can be call the method by creating object only
	
	class E
	{
		public void m4()
		{
			ABC abc = new ABC();
			abc.mABC();
		}
	}

}
}

//https://www.scaler.com/topics/hierarchical-inheritance-in-java/