package wrapperClass;

public class WrapperClass {

	public static void main(String[] args) {
		
		int a1 = 10;
		//what is the difference
		Integer a2 = 10;
		
		Integer a= new Integer(10);
		//System.out.println(a);
		
		Double b = new Double(10.2);
		
		Character c = new Character('k');
		
		Boolean d = new Boolean(true);
		
		// byte and short need to cast
		Byte e = new Byte((byte) 3);
		
		Short f = new Short((short) 4);
		
		// converting primitive data type values into wrapper class objects
		int z = 7;
		Integer zObj = Integer.valueOf(z);
		System.out.println("value of z = "+zObj);
		
		byte y = 8;
		Byte yObj = Byte.valueOf(y); //wrapping
		System.out.println("value of y = "+yObj);
		
		char x ='t';
		Character xObj = Character.valueOf(x);
		System.out.println("value of x = "+xObj);
		// also
		System.out.println(Character.valueOf(x));
	}

}
