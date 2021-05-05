// WAP to find number of vowels in give string.

package StringDemo;

import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a statement:: ");
		String s = sc.nextLine();
		CountVowels vc = new CountVowels();
		System.out.println("Vowels count in statement:: " + vc.VowelCount(s));
	}

	public int VowelCount(String str) {
		int j = str.length(), count=0;
		System.out.println("Length of statement:: " + j);
		for(int i=0; i<j; i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' || 
			   str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U')
			count++;
		}
		return count;
	}
}