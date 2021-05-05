package Basics;

import java.util.Scanner;

// ********* Check any enter number is Factorial or not using recursion (method). *********
// n! = n * (n-1) * (n-2) * ...... 1
// Recursion means a function/method calling itself.


public class FactorialUsingRecursion {
	
	public int findfactorial(int n) {
		if (n<=1)
			return 1;
		else
			return n * findfactorial(n-1);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to find factorial: ");
		int num = sc.nextInt();
		FactorialUsingRecursion f = new FactorialUsingRecursion();
		System.out.println("The Factorial of number " + num +  " is " + f.findfactorial(num) + ".");
	}
}