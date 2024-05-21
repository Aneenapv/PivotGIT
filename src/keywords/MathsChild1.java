package keywords;

public class MathsChild1 extends MathsUtils {
	
	// final method cannot be overridden
//	public void method2()
//	{
//		System.out.println("method 2 in Mathschild1");
//	}

	// final method can be overloaded
	final public void method2(String a)
	{
		System.out.println("final method overloaded"+a);
	}
	
	public void method3()
	{
		System.out.println("methods can be override and overload : I am from mathschild");
	}
}
