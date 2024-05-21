package keywords;

public class MathsUtils {
	
	final double pi = 3.14;
	double g = 9.8;
	
	public void method1()
	{
		System.out.println("method 1 in mathsUtils");
		//pi = 5.43;
// the final variable cannot be changed or reassigned
	}
	
	
	
	// final method cannot be overridden
	final public void method2()
	{
		System.out.println("method 2 in mathsUtils");
		
		String s = "keyword";
		System.out.println("extract key from keyword: "+s.substring(0,3));
		
	}
	
	
	// final method can be overloaded
//	final public void method2(String a)
//	{
//		System.out.println("final method overloaded"+a);
//	}
	
	public void method3()
	{
		System.out.println("methods can be override and overload : I am from mathsutils");
	}

	


}
