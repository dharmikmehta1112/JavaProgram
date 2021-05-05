// WAP to toggle (convert lower to upper and vice versa) each word in a String. I/O: Hello Testing Shastra O/P: hello testing shastra

package StringDemo;

import java.util.Scanner;

public class ToggleEachWord {
	
	public String toggleWord(String str) {
		String rev = "";
		int strlen = str.length();
		System.out.println("Length of input statement:: " + strlen);
//		String words[] = str.split(" ");
		String words[] = str.split("\\s");
		
// Method 1
		
		for(String w : words) {
			String firstChar = w.substring(0, 1);
			String afterChar = w.substring(1);
			rev+=firstChar.toLowerCase() + afterChar.toUpperCase() + " ";
		}
		return rev;
	
	}

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a statement:: ");
		String s = sc.nextLine();
		ToggleEachWord tg = new ToggleEachWord();
		System.out.println("Reverse of each word in input statement:: " + tg.toggleWord(s));
	}
}
