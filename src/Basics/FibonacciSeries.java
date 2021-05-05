package Basics;

import java.util.Scanner;

// ********** Fibonacci Series ~ 0 1 1 2 3 5 8 13 21 34 55 89 etc **********

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number of terms required in fibonacci series: ");
		int num = sc.nextInt();

		int i = 0, a = 0, b = 1, sum = 0;
		
		// System.out.print("Fibonacci Series: ");
		// System.out.print(a + " " + b);

		// while(i<num-2)
		// {			
		// 	sum = a + b;
		// 	System.out.print(" " + sum);
		// 	a = b;
		// 	b = sum;
		// 	i++;
		// }

		// for(i=2; i<num; i++)
		// {
		// 	sum = a + b;
		// 	System.out.print(" " + sum);
		// 	a = b;
		// 	b = sum;
		// }

		System.out.print("Fibonacci Series till " + num + " terms: ");
		for (i=0; i<num; i++) {
			System.out.print(a + " ");
			sum = a + b;
			a = b;
			b = sum;
		}
	}
}