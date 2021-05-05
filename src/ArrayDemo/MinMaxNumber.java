package ArrayDemo;

import java.util.Scanner;

// Find largest and smallest elements of an array.

public class MinMaxNumber {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
// Accept array A size from user
		System.out.print("Enter array size: ");
		int len = sc.nextInt();
		
// Accept array A elements from user
		int a[] = new int[len];
		System.out.print("Enter array, " + len + " elements separated by spaces: ");
		for(int i=0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		
// Print array A all elements
		System.out.print("You enter array: ");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
// Calculate Smallest and Largest elements of an array
		int small=a[0], large=a[0];
		for (int i=1; i<a.length; i++) {
			if (small>a[i])
				small = a[i];
			else
				large = a[i];
		}
		System.out.println("\nSmallest elements of an array: " + small);
		System.out.println("Largest elements of an array: " + large);
	}
}