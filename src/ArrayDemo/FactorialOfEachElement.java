package ArrayDemo;

import java.util.Scanner;

// Array ~ Home Work
// Print Factorial of each element of array A.

public class FactorialOfEachElement {
	
	public static void main(String[] args) {
		
		int fact=1, x=1;
		Scanner sc = new Scanner(System.in);
		
// Accept array A size from user
		System.out.print("Enter array size: ");
		int len = sc.nextInt();
		
// Accept array A elements from user
		int a[] = new int [len];
		System.out.print("Enter array, " + len + " element: ");
		for (int i=0; i<len; i++) {
			a[i]=sc.nextInt();
		}
		
// Print accept array A
		System.out.print("You enter array: ");
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
// Calculate and print factorial of each element of array A.
		System.out.println();
		for (int i=0; i<a.length; i++) {
			while(a[i]>=x) {
				fact = fact * x;
				x++;
			}
		System.out.println("Factorial of array element " + a[i] + " is " + fact);	
		}
	}
}