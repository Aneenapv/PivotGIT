package inheritance;

public class Main {

	public static void main(String[] args) {
		
		A aobj = new B();
		aobj.method1();
		
		System.out.println("------------");
		
		B bobj = new B();
		bobj.method1();
		bobj.method2();
		
		System.out.println("------------");
		
		
		C cobj = new C();
		cobj.method3();
//		cobj.method1();  // IF C extends B
//		cobj.method2();
		
		System.out.println("------------");
		//IF C extends A

		A cobjA = new C();
		cobjA.method1(); 
		//cobjA.method3();

		
		
		
		System.out.println("------------");
		

	}

}
