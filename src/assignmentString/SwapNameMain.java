package assignmentString;
import java.util.*;
public class SwapNameMain {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a name to swap: ");
	String name = sc.nextLine();
	
	SwapName swap = new SwapName(name);
	swap.nameShuffle(name);
	

	}

}
