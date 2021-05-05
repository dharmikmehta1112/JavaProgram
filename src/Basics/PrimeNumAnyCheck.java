package Basics;

import java.util.Scanner;

// ********* Check any enter number is Prime or not. *********

// A prime number is a number that is only divisible by 1 or itself. For example, 11 is only divisible by 1 or itself.
// Other Prime numbers are 2, 3, 5, 7, 11, 13, 17, 19, 23 etc..... 
// Note: 0 and 1 are not prime numbers. 2 is the only even prime number.

public class PrimeNumAnyCheck {
	
	private static void m1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();

		int temp = num, i = 1, count = 0;

		while(i<=temp) {
			if(temp%i==0) {
				count++;
			}
			if(count==2)
				System.out.println(temp + " is a prime number");
			else
				System.out.println(temp + " is not a prime number.");
		}
	}
	
	private static void m2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		if (num==0 || num==1)
			System.out.println(num + " is not a prime number.");
		else if (num==2 || num==3 || num==5 || num==7)
			System.out.println(num + " is a prime number.");
		else if (num%2==0 || num%3==0 || num%5==0 || num%7==0)
			System.out.println(num + " is not a prime number.");
		else
			System.out.println(num + " is a prime number.");
	}
	
	private static void m3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		int count = 0;
		if(num==0 || num==1) {
			System.out.println(num + " is not a prime number.");
		} else {			
			for (int i = 2; i < num/2; i++) {
				if(num%i==0) {
					System.out.println(num + " is not a prime number.");
					count++;
					break;
				}
			}
		}
		if(count==0)
			System.out.println(num + " is a prime number.");
	}
	
	public static void main(String[] args) {
//		m1();
		m2();
//		m3();
	}
}