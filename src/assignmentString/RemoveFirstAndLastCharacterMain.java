package assignmentString;

import java.util.Scanner;

public class RemoveFirstAndLastCharacterMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name to remove first and last character: ");
		String name = sc.next();
		
		RemoveFirstAndLastCharacter remove = new RemoveFirstAndLastCharacter(name);
		
		    remove.firstAndLast(name);
		
	 }

	}
