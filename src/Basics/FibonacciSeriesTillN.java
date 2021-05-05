package Basics;

import java.util.Scanner;

// ********** print Fibonacci Series till N ~ 0 1 1 2 3 5 8 13 21 34 55 89 etc **********

public class FibonacciSeriesTillN {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number till fibonacci series required: ");
		int num = sc.nextInt();

		int i = 0, a = 0, b = 1, sum = 0;
		
		System.out.print("Fibonacci Series till number " +num+ ":: ");
		System.out.print(a);

		while(sum<num) {
				sum = a + b;
				System.out.print(" " + b);
				a = b;
				b = sum;
		}
		
// Method 2
		int f1 = 0, f2 = 1;
		int[] f = new int[num];
		System.out.println();
		System.out.print("Fibonacci Series till number " +num+ ":: ");
		for(int k = 0; k < f.length; k++) {
			f[k]= f1 + f2;
			System.out.print(f[k] + " ");
			f1 = f2;
			f2 = f[k];
		}
		
	}
}