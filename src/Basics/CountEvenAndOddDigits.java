package Basics;

import java.util.Scanner;

//  ******** Count number of even and odd digits in a number *********

public class CountEvenAndOddDigits {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter number: ");
	int num = sc.nextInt();

	int even_count = 0;
	int odd_count = 0;

	while(num>0) {
		int rem = num % 10;
		if(rem%2==0)
			even_count++;
		else
			odd_count++;
		num = num / 10;
	}
	System.out.println("Even Digits: " + even_count + " and Odd Digits: " + odd_count);
	}
}