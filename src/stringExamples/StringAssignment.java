package stringExamples;

import java.util.*;

public class StringAssignment {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 * Q1) Create a function that counts the number of syllables a word has. Each
		 * syllable is separated with a dash Examples numberSyllables("buf-fet") ➞ 2
		 * numberSyllables("beau-ti-ful") ➞ 3 numberSyllables("mon-u-men-tal") ➞ 4
		 * numberSyllables("on-o-mat-o-poe-ia") ➞ 6
		 */

		System.out.println("question 1");

		String syllables = "beau-ti-ful";
		String[] splitSyllables = syllables.split("-");
		System.out.println("Number of syllables = " + splitSyllables.length);

		/*
		 * Q2) Write a function to return the city from each of these vacation spots. As
		 * shown in example below you have to extract Munich, Portland..etc. Hint: City
		 * will always be present in last square brackets in the statement.. Examples
		 * grabCity("[Last Day!] Beer Festival [Munich]") ➞ "Munich"
		 * grabCity("Cheese Factory Tour [Portland]") ➞ "Portland"
		 * grabCity("[50% Off!][Group Tours Included] 5-Day Trip to Onsen [Kyoto]") ➞
		 * "Kyoto"
		 */

		System.out.println();
		System.out.println("question 2");

		String city1 = ("[Last Day!] Beer Festival [Munich]");
		String city2 = ("Cheese Factory Tour [Portland]");
		String city3 = ("[50% Off!][Group Tours Included] 5-Day Trip to Onsen [Kyoto]");
		System.out.println(
				"city 1 name extracted = " + city1.substring(city1.lastIndexOf('[') + 1, (city1.lastIndexOf(']'))));
		System.out.println(
				"city 2 name extracted = " + city2.substring(city2.lastIndexOf('[') + 1, (city2.lastIndexOf(']'))));
		System.out.println(
				"city 3 name extracted = " + city3.substring(city3.lastIndexOf('[') + 1, (city3.lastIndexOf(']'))));

		/*
		 * Q3. Create a function that removes the first and last characters from a
		 * string. Example : removeFirstLast("hello") ➞ "ell" removeFirstLast("a") ➞ "a"
		 */

//	String name = "hello";
//	System.out.println("remove first and last character from a string : "+name.substring(1, 4));

		// using scanner
		System.out.println();
		System.out.println("question 3");

		System.out.println("Enter a name to remove first and last character: ");
		String name1 = sc.next();
		if(name1.length()<=1)
		{
			System.out.println(name1);
		}
		else
		{
		System.out
				.println("remove first and last character from a string: " + name1.substring(1, (name1.length() - 1)));
		}
		
		// or

//    char[] charSeperate = name1.toCharArray();
//    System.out.println("character seperate = " +Arrays.toString(charSeperate));
//    System.out.println("length = "+charSeperate.length);
//	System.out.println(" trial : remove first and last character from a string  : "+name1.substring(1,(charSeperate.length -1)));

		/*
		 * Q4) Create a method that accepts a string (of a person's first and last name)
		 * and returns a string with the first and last name swapped. Examples
		 * nameShuffle("Donald Trump") ➞ "Trump Donald" nameShuffle("Seymour Butts") ➞
		 * "Butts Seymour"
		 */

//	public String getSwapPersonName()
//	{

		System.out.println();
		System.out.println("question 4 ");

		String personName = "Donald Trumph";
		String[] personNameArray = personName.split(" ");
		String firstName = personNameArray[0];
		String secondName = personNameArray[1];
		System.out.println("after swapping = " + secondName + " " + firstName);

//	this.personName = personName;
//	return personName;
		// }

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
		System.out.println();
		System.out.println("question 5");

		System.out.println("enter a full word to check prefix and suffix:");
		String word = sc.next();
		System.out.println("enter prefix: ");
		String prefix = sc.next();
		System.out.println("enter suffix: ");
		String suffix = sc.next();

		if (word.startsWith(prefix)) {
			System.out.println("prefix true");
		}
		if (word.endsWith(suffix)) {
			System.out.println("suffix true");
		} else {
			System.out.println("false");
		}

	}

}
