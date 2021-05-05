package Basics;

import java.util.Scanner;

// ********* Check any enter number is Factorial or not. *********
// n! = n * (n-1) * (n-2) * ...... 1

// Using while loop:
// public class Factorial
// {
// 	public static void main(String[] args)
// 	{
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("Enter a number to find factorial: ");
// 		int num = sc.nextInt();

// 		int temp = num, i = 1, fact = 1;

// 		// while(i<=temp)
// 		while (temp>=i)
// 		{
// 			fact = fact * i;
// 			i++;
// 		}
// 		System.out.println("The Factorial of number " + num +  " is " + fact + ".");
// 	}
// }

// Using for loop:
public class Factorial {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to find factorial: ");
		int num = sc.nextInt();

		int fact = 1;

		for (int i=1; i<=num; i++) {
			fact = fact * i;	
		}
		System.out.println("The Factorial of number " + num +  " is " + fact + ".");
	}
}