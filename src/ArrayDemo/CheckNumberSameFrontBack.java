package ArrayDemo;

import java.util.Scanner;

// Write a program to check if elements of an array are same or not it read from front or back.

public class CheckNumberSameFrontBack {
	
	public static void main(String[] args) {
		
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
		
// Check array elements are same or not if read from front or back
		for (int i=0; i<a.length/2; i++) {
			if (a[i]==a[len-1-i])
				System.out.print("\nElement at " + i + " is same as element at " + (len-1-i) + ".");
			else
				System.out.print("\nElement at " + i + " is not same as element at " + (len-1-i) + ".");
		}
	}
}