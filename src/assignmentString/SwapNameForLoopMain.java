package assignmentString;

import java.util.Scanner;

public class SwapNameForLoopMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name to swap: ");
		String name = sc.nextLine();
		
		SwapNameForLoop swap = new SwapNameForLoop(name);
		swap.nameShuffle(name);
		

	}

}
