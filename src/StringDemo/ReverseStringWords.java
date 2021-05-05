// WAP to reverse the words of a given string. I/O Hello Testing Shastra. O/P Shastra Testing Hello 

package StringDemo;

import java.util.Scanner;

public class ReverseStringWords
{	
	public String reverseStringUsingWord(String str) 
	{
		String str2 = "";
		int strlen = str.length();
		System.out.println("Length of input statement:: " + strlen);

// Method 1	
		String words[] = str.split(" "); 		//
		System.out.println("Number of words in a statement:: "+words.length);
		for(int i=words.length-1; i>=0; i--)
		{
			str2 = str2 + words[i] + " ";
		}
		return str2;

// Method 2
		
		
		
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a statement:: ");
		String s = sc.nextLine();
		ReverseStringWords rw = new ReverseStringWords();
		System.out.println("Reverse string using word in input statement:: " + rw.reverseStringUsingWord(s));
	}
}