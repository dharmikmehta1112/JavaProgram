// WAP to replace all special character with 'X'

package StringDemo;

import java.util.Scanner;

public class ReplaceSpecialCharacter {
	
	public String replaceWithX(String str) {
		String rev = "";
		int j = str.length();
		System.out.println("Length of an enter statement:: " + j);
		rev = rev + str.replaceAll("[^A-Za-z0-9 ,]","");
		return rev;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a statement (include some special character):: ");
		String s = sc.nextLine();
		ReplaceSpecialCharacter rscx = new ReplaceSpecialCharacter();
		System.out.println("Statement after replacing special character with X:: " + rscx.replaceWithX(s));
	}
}