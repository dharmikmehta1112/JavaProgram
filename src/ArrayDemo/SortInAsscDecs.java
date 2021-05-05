package ArrayDemo;

import java.util.Scanner;

// Array ~ Home Work
// Sort array element in ascending and descending : X = {7, 71, 85, 97, 15, 3, 8}

public class SortInAsscDecs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
// Accept array A size from user
		System.out.print("Enter array size: ");
		int len = sc.nextInt();
		int a[] = new int[len];
		
// Accept array A elements from user 
		System.out.print("Enter array, " + len + " element:: ");
		for (int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();	
		}
		
// Print accept array A
		System.out.print("Enter array: ");
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
// Ascending Order Sort array A
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a.length; j++) {				
				if(a[i]<a[j]) {
					int asort = a[i];
					a[i] = a[j];
					a[j] = asort;
				}	
			}
		}
		System.out.print("\nArray in Ascending Order: ");
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
// Descending Order Sort array A
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a.length; j++) {				
				if(a[i]>a[j]) {
					int dsort = a[i];
					a[i] = a[j];
					a[j] = dsort;
				}	
			}
		}
		System.out.print("\nArray in Descending Order: ");
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}