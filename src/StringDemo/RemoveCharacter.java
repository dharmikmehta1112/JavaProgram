package StringDemo;

import java.util.Scanner;

public class RemoveCharacter {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:: ");
		String s = sc.nextLine();
		System.out.println("Enter a character to search:: ");
		char c = sc.next().charAt(0);
		RemoveCharacter rc = new RemoveCharacter();
		System.out.println("String after removing the char:: " + rc.removeChar(s,c));
		
	}
	
	public String removeChar(String str, char ch) {
		
		String rev = "";
		rev+= str.substring(0, ch) + str.substring(ch + 1);
		return str;
	}

}
