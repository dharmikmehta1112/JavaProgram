package StringDemo;

import java.util.Scanner;

/**
 * @author Dharmik Mehta
 *
 *         IMP IQ 
 *         Count number of words in an given string.
 *         trim() --> trim removes extra spaces from beginning and ending of string and return string.
 *         split() --> split the string on basis of regex and return string array.
 */
public class CountNumberOfWords {

	public int NumberOfWordsCountUsingMethods(String str) {
		String s[] = str.trim().split(" ");
//		String s[] = str.trim().split("\\s");		// \\s --> matches single whitespace character
//		String s[] = str.trim().split("\\s+");		// \\s+ --> matches sequence of one or more whitespace characters
		return s.length;
	}

	public int NumberOfWordsCount(String str) {
		int wordCount = 1;			// Remember to initialize to 1 and not to 0
		int len = str.length();
		System.out.println("Length of enter statement:: "+len);
		for (int i = 0; i < len; i++) {
			if(str.charAt(i)==' ' && str.charAt(i+1)!=' ') {
				wordCount++;
			}
		}
		return wordCount;
	}

	public static void main(String[] args) {
		CountNumberOfWords c = new CountNumberOfWords();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a statement:: ");
		String s = sc.nextLine();
		System.out.println("Number of words in a given statement:: " + c.NumberOfWordsCountUsingMethods(s));
		System.out.println("Number of words in a given statement:: " + c.NumberOfWordsCount(s));
	}
}