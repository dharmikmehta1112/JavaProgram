// WAP to reverse a string. I/O Hello Testing Shastra O/P artsahS gnitseT olleH

package StringDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseString {
	
	public String reverseString(String str) {
		char[] arr = str.toCharArray();
		List<Character> al = new ArrayList();
		for(char o : arr) {
			al.add(o);
		}
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);
		str = al.toString();
		return str;
	}
	
	
//	public String reverseString(String str) {
//		String rev = "";			// empty string
//		int len = str.length();
//		System.out.println("Length of actual string:: " + len);
//		for(int i=len-1; i>=0; i--)
//		{
//			rev = rev + str.charAt(i);		// using string concatenation (+) operator
//		}
//		return rev;
//	}
	
	
//	public String reverseString(String str) {
//		String rev = "";					// empty string
//		char ch[] = str.toCharArray();		// using character array
//		int len = ch.length;
//		System.out.println("Length of actual string:: " + len);
//		for(int i=len-1; i>=0; i--)
//		{
//			rev = rev + ch[i];				// using character array
//		}
//		return rev;
//	}
		
	
//	public StringBuffer reverseString(String str) {
//		StringBuffer sb = new StringBuffer(str);		// using StringBuffer class
//		return sb.reverse();
//	}
	
	
//	public String reverseString(String str) {
//		StringBuffer sb = new StringBuffer(str);		// using StringBuffer class
//		sb = sb.reverse();								// directly using reverse method of stringbuffer class
//		String rev = sb.toString();						// converting from stringbuffer to string
//		return rev;
// }
	
	
//	public String reverseString(String str) {
//		StringBuffer sb = new StringBuffer();
//		sb.append(str);
//		sb.reverse();
//		str = sb.toString();
//		return str;	
//	}
	
	
//	public String reverseString(String str) {
//		StringBuilder sb = new StringBuilder(str);		// using StringBuilder class
//		sb = sb.reverse();								// directly using reverse method of stringbuilderr class
//		String rev = sb.toString();						// converting from stringbuilder to string
//		return rev;
//	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter actual string:: ");
		String s = sc.nextLine();
		ReverseString r = new ReverseString();
		System.out.println("Reverse of actual string:: " + r.reverseString(s));
	}
}