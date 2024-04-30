package assignmentString;
import java.util.*;
public class PrefixAndSuffix {
	
	/*
	 * Q5) Create two functions: isPrefix(word, prefix-) and isSuffix(word,
	 * -suffix). isPrefix should return true if it begins with the prefix argument.
	 * isSuffix should return true if it ends with the suffix argument. Otherwise
	 * return false.
	 * 
	 * Examples : isPrefix("automation", "auto-") ➞ true isSuffix("arachnophobia",
	 * "-phobia") ➞ true isPrefix("retrospect", "sub-") ➞ false isSuffix("vocation",
	 * "-logy") ➞ false
	 */
	
	String word;
	String prefix;
	String suffix;
	
	
	public PrefixAndSuffix(String word, String prefix, String suffix) {
		super();
		this.word = word;
		this.prefix = prefix;
		this.suffix = suffix;
	}

	public boolean isPrefix(String word, String prefix)
	{
	if (word.startsWith(prefix)) {
		System.out.println("prefix true");
		return true;
	}
	else
	{
		System.out.println("prefix false");
		return false;
	}
	}
	
	public boolean isSuffix(String word, String suffix)
	{
	if (word.endsWith(suffix)) {
		System.out.println();
		System.out.println("suffix true");
		return true;
	} else {
		System.out.println(" suffix false");
		return false;
	}
	

   }


}
