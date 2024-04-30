package stringExamples;
import java.util.*;
public class trialswap {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a name to swap: ");
		String personName = sc.nextLine();
	
		String[] personNameArray = personName.split(" ");
	
		System.out.println("name after swapping = "+personNameArray[1] +  " " +personNameArray[0]);

	}

}
