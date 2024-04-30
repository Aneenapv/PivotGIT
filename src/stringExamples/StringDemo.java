package stringExamples;

import java.util.Arrays;

public class StringDemo {
	
	public static void main(String[] args) {
		
		String name = "Aneena Vincent";

// seperate character from string
		char[] characterArray = name.toCharArray();
		System.out.println("split character from string = "+Arrays.toString(characterArray));
	
// split strings
		String[] nameArray= name.split(" ");
		//String[] nameArray= name.split("e");
		System.out.println("split string = "+Arrays.toString(nameArray));
		System.out.println("first name = "+nameArray[0]);
		System.out.println("last name = "+nameArray[1]);
		//System.out.println("last name = "+nameArray[2]);
		//System.out.println("last name = "+nameArray[3]);
		
		String splitASentence = "I decided to study java";
		String[] split = splitASentence.split(" ");
		System.out.println("Sentence splitted = "+Arrays.toString(split));
		String[] split1 = splitASentence.split("to");
		System.out.println("Sentence splitted1 = "+Arrays.toString(split1));
		
// replace and index
		String nameOfStudent = "Arshdeep";
		System.out.println("Index of letter d in Arshdeep:" +nameOfStudent.indexOf("d"));
		System.out.println("Name changed : "+nameOfStudent.replace("deep", "preet") );
		
		String h = nameOfStudent.replace("deep", "preet");
		 
		 System.out.println("trial :Index of letter p in Arshpreet:" +h.indexOf("e"));
		 
//contains 
		 String email = "centanviQWWWWDEn68@gmail.com";
		 if(email.contains("@"))
		 {
			 System.out.println("Email is valid");
		 }
		 else
		 {
			 System.out.println("Email is invalid");
		 }
		 
//substring	 
		 System.out.println("domain part of email: "+email.substring(11));
		 //output- @gmail.com
		 
		 System.out.println("Email domain: "+email.substring(email.indexOf("@")));
		 System.out.println("Email domain without @:::: "+email.substring(email.indexOf("@")+1));
		 System.out.println("Name in email :::: "+email.substring(0,(email.indexOf("@")))) ;
		 
		 
 // concat two strings
		 
		 String sentence1 = "I love java ";
		 String sentence2 = "programming";
		 System.out.println("After concatenation = "+sentence1.concat(sentence2));
		 
//escape character 
		 String sentence3 = "hi how \"are\" you";
		 System.out.println("escape character = "+sentence3);
		 
		 
		 
		 
	}

}
