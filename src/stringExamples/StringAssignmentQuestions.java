package stringExamples;

import java.util.*;

public class StringAssignmentQuestions {
	
	public static void main(String[] args) {
		
	String swap = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a name: ");
		String fullName = sc.nextLine();	
		String[] nameArray = fullName.split(" ");
		
	   for(int i=0;i<nameArray.length; i++)
	   {
		 swap = nameArray[i];
	   } 
	   System.out.println("swap="+swap);

}
}