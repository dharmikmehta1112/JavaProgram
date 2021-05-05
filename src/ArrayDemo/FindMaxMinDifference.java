package ArrayDemo;

import java.util.Scanner;

// Consider an integer array, the number of elements in which is determined by the user.
// The elements are also taken as input from the user.
// WAP to find those pair of elements that has the maximum and minimum difference among all element pairs.
// Hint: maximum difference = highest - lowest, minimum difference = second lowest - lowest

public class FindMaxMinDifference {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
// Accept array A size from user
		System.out.print("Enter array size (even): ");
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
		
// Calculate Maximum and Minimum difference in pair of elements among all element pairs
// Hint: maximum difference = highest - lowest, minimum difference = second lowest - lowest		32 63 8 27 40
		int temp, min_diff=0, max_diff=0;
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<i; j++) {
				if (a[i]<a[j]) {		// Sort Array in ascending (or can sort in descending also to find min, max etc.)
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}	
		System.out.print("\nSorted Array: ");
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.print("\nLowest: " + a[0]);
		System.out.print("\nSecond Lowest: " + a[1]);
		System.out.print("\nHighest: " + a[len-1]);
		System.out.print("\nSecond Highest: " + a[len-2]);
		
		max_diff = a[len-1] - a[0];
		min_diff = a[1] - a[0];
		
		System.out.println("\nMaximum Difference: " + max_diff);
		System.out.println("Minimum Difference: " + min_diff);
	}
}