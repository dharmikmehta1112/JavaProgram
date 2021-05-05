// WAP to check whether a given string is Palindrome or not. I/O nitin - yes, Nitin - no

package StringDemo;

import java.util.Scanner;

public class PalindromeWordCheck {

	public boolean isPalindrome(String str) {
		int j=str.length();
		System.out.println("Length of an enter string:: " + j);	

// Method 1		
		String rev = "";
		for(int i=0; i<=j-1; i++) {
			if(str.charAt(i)==str.charAt(j-1)) {
				rev +=str.charAt(j-1);
			}
			j--;
		}
		if(str.equals(rev))
			return true;
		else
			return false;

// Method 2		
//		StringBuffer sb = new StringBuffer(str);
//		rev = sb.reverse().toString();
//		if(str.equals(rev))
//			return true;
//		else
//			return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string:: ");
		String s = sc.nextLine();
		PalindromeWordCheck p = new PalindromeWordCheck();
		if(p.isPalindrome(s))
			System.out.println("The string " + s + " is a Palindrome.");
		else
			System.out.println("The string " + s + " is not a Palindrome.");
	}
}