// WAP to find longest word from a given String.

package StringDemo;

import java.util.Scanner;

public class LongestWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a statement:: ");
		String s = sc.nextLine();
		LongestWord sw = new LongestWord();
		System.out.println("The longest word in a statement:: " + sw.FindLongestWord(s));
	}

	public String FindLongestWord(String str) {
		int j = str.length();
		System.out.println("Length of an enter statement:: " + j);
		String words[] = str.split(" ");
		String max = words[0];
		for (int i = 1; i < words.length; i++) {
			if (words[i].length() > max.length()) {
				max = words[i];
			}
		}
		return max;
	}
}