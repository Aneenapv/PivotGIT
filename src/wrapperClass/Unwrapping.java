package wrapperClass;

public class Unwrapping {

	public static void main(String[] args) {
   
	// converting wrapper class objects to primitive data type values
		
		Integer aObj = new Integer(9);
		int a = aObj.intValue(); //unwrapping
		System.out.println(a);
		
		Character bObj = new Character('w');
		char b = bObj.charValue();
		System.out.println(b);
		
		Byte cObj = new Byte((byte) 2);
		byte c =  cObj.byteValue();
		System.out.println(c);
		

	}

}
