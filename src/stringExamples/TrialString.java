package stringExamples;
import java.util.*;
public class TrialString {

	public static void main(String[] args) {
		

/* Q5) Create two functions: isPrefix(word, prefix-) and isSuffix(word, -suffix).
isPrefix should return true if it begins with the prefix argument.
isSuffix should return true if it ends with the suffix argument.
Otherwise return false. 

Examples : isPrefix("automation", "auto-") ➞ true
isSuffix("arachnophobia", "-phobia") ➞ true
isPrefix("retrospect", "sub-") ➞ false
isSuffix("vocation", "-logy") ➞ false  */
	
    Scanner sc = new Scanner(System.in);
	System.out.println("enter a full word to check prefix and suffix:");
	String word = sc.next();
	System.out.println("enter prefix: ");
	String prefix = sc.next();
	System.out.println("enter suffix: ");
	String suffix = sc.next();
	

	   if(word.startsWith(prefix))
	    {
		System.out.println("prefix true");
	    }
	  else if(word.endsWith(suffix))
		{
		System.out.println("suffix true");
		}
	  else
		{
		System.out.println("false");
		}

	
	}
		

}


