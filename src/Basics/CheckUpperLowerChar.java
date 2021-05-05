package Basics;

import java.util.Scanner;

/* Write a program to check whether a entered character is lowercase ( a to z ) or uppercase ( A to Z ). */
// ASCII ~ 0 is 48 ...... 9 is 57 ...... A is 65 ...... Z is 90 ...... a is 97 ...... z is 122

public class CheckUpperLowerChar {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner (System.in);
		System.out.print("Enter any alphabetic character: ");
		char alpha = keyboard.next().charAt(0);

		if (alpha>=97 && alpha<=122)
			System.out.println(alpha + " is lowercase character.");
		else if (alpha>=65 && alpha<=90)
			System.out.println(alpha + " is uppercase character.");	
		else
			System.out.println("You enter an valid character.");
	}
}