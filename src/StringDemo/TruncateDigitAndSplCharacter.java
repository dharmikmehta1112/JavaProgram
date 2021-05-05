// WAP to truncate digit and special characters from string and print the string. I/O Te$t!n9 $has7tra.  O/P Tetn hastra.

package StringDemo;

import java.util.Scanner;

public class TruncateDigitAndSplCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a statement (include some special character):: ");
		String s = sc.nextLine();
		TruncateDigitAndSplCharacter tr = new TruncateDigitAndSplCharacter();
		System.out.println("Statement after truncating digit and special character:: " + tr.Truncate(s));
	}

	public String Truncate(String str) {
		String rev = "";
		int j = str.length();
		System.out.println("Length of an enter statement:: " + j);
		rev = rev + str.replaceAll("[^A-Za-z ]","");
		return rev;
	}
}