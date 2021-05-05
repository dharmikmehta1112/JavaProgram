package ArrayDemo;

import java.util.Scanner;

// Array ~ Home Work
// Find minimum and maximum value element from array: X = {7, 71, 85, 97, 15, 3, 8}
// Fin min, secmin, max, secmax

public class MinMaxFind {

	private static void minAndSecMin(int a[]) {
	// Calculate and Print Minimum and Second Minimum Value from array A
		int min = a[0];
		int secmin = 0;
		for (int i=0; i<a.length; i++) {
			if(a[i]<min) {
				secmin = min;
				min = a[i];				
			} else if(a[i]<secmin && a[i]!=min) {
				secmin = a[i];
			}
		}
		System.out.println();
		System.out.print("Minimum value in enter array: " + min);
		System.out.println();
		System.out.print("Second Minimum value in enter array: " + secmin);
	}

	private static void maxAndSecMax(int a[]) {
	// Calculate and Print Maximum and Second Maximum Value from array A
		int max = 0;
		int secmax = 0;
		for (int i=0; i<a.length; i++) {
			if(a[i]>max) {				
				secmax = max;
				max = a[i];
			} else if(a[i]>secmax && a[i]!=max) {
				secmax = a[i];
			}
		}
		System.out.println();
		System.out.print("Maximum value in enter array: " + max);
		System.out.println();
		System.out.print("Second Maximum value in enter array: " + secmax);
	}

	public static void main(String[] args) {
/*		
		Scanner sc = new Scanner(System.in);
		
// Accept array A size from user
		System.out.print("Enter array size: ");
		int len = sc.nextInt();
		int a[] = new int[len];
		
// Accept array A elements from user
		System.out.print("Enter array, " + len + " element separated by spaces: ");
		for (int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();	
		}
*/		
		int[] a = {7, 71, 85, 97, 15, 3, 8};
		
// Print accept array A
		System.out.print("Enter array: ");
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}

		minAndSecMin(a);
		maxAndSecMax(a);
	}
}