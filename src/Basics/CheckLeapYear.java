package Basics;

import java.util.Scanner;

/* Write a program to check if a year is leap year or not.
If a year is divisible by 4 then it is leap year but if the year is century year like 2000, 1900, 2100 then it must be divisible by 400. */

public class CheckLeapYear {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = keyboard.nextInt();

		if(year%4 == 0 || year%400 == 0)
			System.out.println("Leap Year");
		else if(year%4 != 0 || year%400 != 0)
			System.out.println("Non-Leap Year");
		else
			System.out.println("Invalid entry");
	}
}