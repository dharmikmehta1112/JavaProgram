package Basics;

import java.util.Scanner;

// ********* Check from 1 to 100 a enter number is Palindrome or not. *********
// A Palindrome Number is a number that even when reversed is same as original number.
// Ex: 121, 393, 34043, 111, 555, 48084 etc

public class PalindromeNumCheck {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();

		int temp = num, rem, sum = 0;

		if(num>=0 && num<=100) {
			while(temp>0) {
				rem = temp%10;
				sum = sum*10 + rem;
				temp = temp/10;
			}
			if(num == sum)
				System.out.println(num + " is a Palindrome Number.");
			else
				System.out.println(num + " is not a Palindrome Number.");
		}
		else
			System.out.println("Invalid number.");
	}
}