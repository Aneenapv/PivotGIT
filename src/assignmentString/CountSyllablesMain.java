package assignmentString;

import java.util.Scanner;

public class CountSyllablesMain {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a word with hypens :");	
		String word = sc.next();
		
		CountSyllables count = new CountSyllables(word);
		
		count.syllables(word);

	}

}
