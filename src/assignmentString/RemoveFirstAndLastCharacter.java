package assignmentString;
import java.util.*;
public class RemoveFirstAndLastCharacter {
	
	/*
	 * Q3. Create a function that removes the first and last characters from a
	 * string. Example : removeFirstLast("hello") ➞ "ell" removeFirstLast("a") ➞ "a"
	 */
	

		String name;

		public RemoveFirstAndLastCharacter(String name) {
		super();
		this.name = name;
	     }
		

		public void firstAndLast(String name)
		{
		if(name.length()>2)
		{
		    System.out
					.println("remove first and last character from a string: " + name.substring(1, (name.length() - 1)));
	  
		}
		else
		{
		   System.out.println(name);
		}
	
		}
    }

