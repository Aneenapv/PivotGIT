package keywords;

public class Main {

	public static void main(String[] args) {
		
		MathsUtils maths = new MathsUtils();
		//maths.pi = 3.89; we cannot change anywhere final variable
		
		maths.method1();
		maths.method2();
		maths.method3();
		
	 System.out.println("--------------------");
		
		MathsChild1 child = new MathsChild1();
		child.method1();
		child.method2();
		child.method2(" appu ");
		child.method3();
		
	 System.out.println("--------------------");
	 
		FinalClass finalClass = new FinalClass("a");
		finalClass.method1();
		finalClass.method2();
		finalClass.method3();
		
		System.out.println("--------------------");
		
		System.out.println(finalClass.a);
    
		System.out.println(finalClass.a = "we can initialize values to variable in final class. "
				+"That means variables in final class are not final variables.");
		System.out.println(finalClass.a);
		
		
	}

}

