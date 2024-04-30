package assignmentString;

import java.util.Scanner;

public class PrefixAndSuffixMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a full word to check prefix and suffix:");
		String word = sc.next();
		
		System.out.println("enter prefix: ");
		String prefix = sc.next();
		
		System.out.println("enter suffix: ");
		String suffix = sc.next();
		
		PrefixAndSuffix fix = new PrefixAndSuffix(word,prefix,suffix);
		
		fix.isPrefix(word, prefix);
		
		fix.isSuffix(word, suffix);
	

	}

}
