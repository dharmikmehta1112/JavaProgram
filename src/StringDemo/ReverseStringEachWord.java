// WAP to reverse the words of a given string without changing their position. I/O Hello Testing Shastra O/P olleH gnitseT artsahS

package StringDemo;

import java.util.Scanner;

public class ReverseStringEachWord {
	
	public String ReverseWord(String str) {
		String rev = "";
		int strlen = str.length();
		System.out.println("Length of input statement:: " + strlen);
//		String words[] = str.split(" ");
		String words[] = str.split("\\s");
		
// Method 1
//		for(int i=0; i<words.length; i++)
//		{
//			String s = words[i];
//			for(int j=s.length()-1; j>=0; j--)
//			{
//				rev = rev + s.charAt(j);
//			}
//			rev = rev + " ";
//		}
//		return rev;
		
// Method 2
		for(String w : words) {
			StringBuffer sb = new StringBuffer(w);
			rev += sb.reverse().toString() + " ";
		}		
		return rev;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a statement:: ");
		String s = sc.nextLine();
		ReverseStringEachWord rw = new ReverseStringEachWord();
		System.out.println("Reverse of each word in input statement:: " + rw.ReverseWord(s));
	}
}