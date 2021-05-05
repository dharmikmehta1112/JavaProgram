// WAP to count number of Palindrome words present in given String. I/O This is NITIN. He is ISI agent.

package StringDemo;

import java.util.Scanner;

public class PalindromeWordCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a statement (with or witout palindrome words):: ");
		String s = sc.nextLine();
		PalindromeWordCount pc = new PalindromeWordCount();
		System.out.println("The number of palindrome words in statement:: " + pc.PalindromeWordsCount(s));
	}

	public int PalindromeWordsCount(String str) {
		int count = 0;
		String rev = "";
		int strlen = str.length();
		System.out.println("Length of input statement:: " + strlen);
		String words[] = str.split(" "); // we can also use \\s for single space
		int wlen = words.length;
		for (int i = 0; i <= wlen - 1; i++) {
			String s = words[i];
			int len = s.length();
			for (int j = 0; j <= len - 1; j++) {
				if (s.charAt(j) == s.charAt(len-1)) {
					len--;
				}
			}
			count++;
			wlen--;
		}
		return count;
	}
}