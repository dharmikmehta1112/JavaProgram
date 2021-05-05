package ArrayDemo;

import java.util.Scanner;

// Array ~ Home Work
// Copy all elements from array A to array B in reverse direction.
// If A = {1, 2, 3, 4, 5} then print B = {5, 4, 3, 2, 1} 

public class ReverseCopy2Array {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
// Accept array A size from user
		System.out.print("Enter array size: ");
		int len = sc.nextInt();
		int a[] = new int [len];
		int size = len;
		int b[] = new int [size];
		
// Accept array A elements from user
		System.out.print("Enter array, " + len + " elements separated by spaces: ");
		for (int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		
// Print accept array A
		System.out.print("You enter a array: ");
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
// Copy all elements from array A to array B in reverse direction
		for (int i=0; i<a.length; i++) {
			b[size-1] = a[i];
			size--;
		}

// Print Array B
		System.out.print("\nReverse of enter array: ");
		for (int i=0; i<a.length; i++) {
			System.out.print(b[i] + " ");
		}
	}
}