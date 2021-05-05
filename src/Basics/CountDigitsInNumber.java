package Basics;

import java.util.Scanner;

//****** Count number of digits in a number ******* */

public class CountDigitsInNumber {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		
		int unum = num;
		int count = 0;
		
		while(unum>0) {
			unum = unum / 10;
			count++;
		}
		
		System.out.println("Number of Digits in " + num + ": " + count);
	}	
}