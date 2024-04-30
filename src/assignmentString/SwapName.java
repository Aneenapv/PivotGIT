package assignmentString;

public class SwapName {
	
	/*
	 * Q4) Create a method that accepts a string (of a person's first and last name)
	 * and returns a string with the first and last name swapped. Examples
	 * nameShuffle("Donald Trump") ➞ "Trump Donald" nameShuffle("Seymour Butts") ➞
	 * "Butts Seymour"
	 */

	String name;
	
   public SwapName(String name) {
		super();
		this.name = name;
	}

public String nameShuffle(String name)
    {
	String[] nameArray = name.split(" ");
	String firstName = nameArray[0];
	String secondName =nameArray[1];
	System.out.println("after swapping = " + secondName + " " + firstName);
     return " ";
	 }

}
