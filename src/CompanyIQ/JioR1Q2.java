package CompanyIQ;

// Check string is palindrome or not.

public class JioR1Q2 {
	
	private static void checkPalindrome(String s) {
		String rev = "";
		for (int i = s.length()-1; i>=0 ; i--) {
			rev = rev + s.charAt(i);
		}
		if(s.equals(rev))
			System.out.println("String is a Palindrome.");
		else
			System.out.println("String is not a Palindrome.");
	}
	
	public static void main(String[] args) {
		String str="aabaa";
		checkPalindrome(str);
	}

}
