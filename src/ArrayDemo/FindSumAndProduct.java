package ArrayDemo;

import java.util.Scanner;

// Write a program to find the sum and product of all elements of an array.

public class FindSumAndProduct {
	
	public static void main(String[] args) {
		
		int sum=0, prod=1;
		Scanner sc = new Scanner(System.in);
		
// Accept array A size from user
		System.out.print("Enter array size: ");
		int len = sc.nextInt();
		
// Accept array A elements from user
		int a[] = new int[len];
		System.out.print("Enter array, " + len + " elements separated by spaces: ");
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		
// Print array A all elements
		System.out.print("You enter array: ");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
// Calculate Sum and Product of all elements of an array
		for (int i=0; i<a.length; i++) {
			sum = sum + a[i];
			prod = prod * a[i];
		}
		
		System.out.println("\nSum of all elements of an array: " + sum);
		System.out.println("Product of all elements of an array: " + prod);
	}
}