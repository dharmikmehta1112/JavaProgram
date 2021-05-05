// WAP to find shortest word from a given String.

package StringDemo;

import java.util.Scanner;

public class ShortestWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a statement:: ");
		String s = sc.nextLine();
		ShortestWord sw = new ShortestWord();
		System.out.println("The shortest word in a statement:: " + sw.FindShortestWord(s));
	}

	public String FindShortestWord(String str) {
		int j = str.length();
		System.out.println("Length of an enter statement:: " + j);
		String words[] = str.split(" ");
		String min = words[0];
		for (int i = 1; i < words.length; i++) {
			if (words[i].length() < min.length()) {
				min = words[i];
			}
		}
		return min;
	}
}