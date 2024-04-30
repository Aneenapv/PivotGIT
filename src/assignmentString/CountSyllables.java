package assignmentString;

import java.util.Scanner;

public class CountSyllables {
	
	/*
	 * Q1) Create a function that counts the number of syllables a word has. Each
	 * syllable is separated with a dash Examples numberSyllables("buf-fet") ➞ 2
	 * numberSyllables("beau-ti-ful") ➞ 3 numberSyllables("mon-u-men-tal") ➞ 4
	 * numberSyllables("on-o-mat-o-poe-ia") ➞ 6
	 */

	
	String word;
	
	public CountSyllables(String word) {
		super();
		this.word = word;
	}

	public int syllables(String word)
	{
	String[] splitWord = word.split("-");
	System.out.println("Number of syllables = "+ (splitWord.length));
	return (splitWord.length);
    }
}