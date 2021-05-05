// WAP to convert first character of every word to capital. I/P i love my india. O/P I Love My India.

package StringDemo;

import java.util.Scanner;

public class FirstCharUpper {

	public String firstcharuppercase(String str) {
		int j = str.length();
		System.out.println("Length of enter statement: " + j);
		String str1 = "";
		
// Method 1		
//		str = " " + str;
//		for (int i = 0; i < j + 1; i++) {
//			char ch = str.charAt(i);
//			if (ch == ' ') {
//				str1 = str1 + ch;
//				i++;
//				ch = str.charAt(i);
//				str1 = str1 + Character.toUpperCase(ch); // *
//			} else
//				str1 = str1 + ch;
//		}
//		return str1;
		
// Method 2
	
//		String word[] = str.split(" ");
		String word[] = str.split("\\s");
		for(String w : word) {
			String firstChar = w.substring(0, 1);
			String afterFirstChar = w.substring(1);
			str1+=firstChar.toUpperCase() + afterFirstChar + " ";
		}
		return str1;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a statement: ");
		String s = sc.nextLine();
		FirstCharUpper fc = new FirstCharUpper();
		System.out.println("First letter uppercase statement: " + fc.firstcharuppercase(s));
	}
}