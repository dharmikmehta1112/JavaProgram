package StringDemo;

import java.util.Scanner;

public class RemoveCharWithPosition {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:: ");
		String s = sc.nextLine();
		System.out.println("Enter a character postion to remove:: ");
		int p = sc.nextInt();
		RemoveCharWithPosition rc = new RemoveCharWithPosition();
		System.out.println("String after removing the char:: " + rc.removeCharUsingPostion(s,p));
		
	}
	
	public String removeCharUsingPostion(String str, int p) {
		return str.substring(0, p) + str.substring(p+1);
		
	}
	
}
