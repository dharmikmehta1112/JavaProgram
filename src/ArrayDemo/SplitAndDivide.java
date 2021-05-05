package ArrayDemo;

import java.util.Scanner;

// Take an array of 10 elements. Split it into middle and store the elements in two dfferent arrays.
// E.g.- INITIAL array : 58	24	13	15	63	9	8	81	1	78
// After spliting :	58	24	13	15	63		and 	9	8	81	1	78

public class SplitAndDivide {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
// Accept array A size from user
		System.out.print("Enter array size (even): ");
		int len = sc.nextInt();
		
// Accept array A elements from user
		int a[] = new int[len];
		int s1[] = new int[len/2];
		int s2[] = new int[len/2];
		System.out.print("Enter array, " + len + " elements separated by spaces: ");
		
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		
// Print array A all elements
		System.out.print("You enter array: ");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
// Array A split into middle, Store the elements in 2 different arrays and print both
		int s = a.length/2;
		for (int i=0; i<a.length; i++) {
			if (i<s)
				s1[i] = a[i];
			else
				s2[i-s] = a[i];
		}
		System.out.print("\nSplit array 1: ");
		
		for (int i=0; i<s1.length; i++) {
			System.out.print(s1[i] + " ");	
		}
		
		System.out.print("\nSplit array 2: ");
		for (int i=0; i<s2.length; i++) {
			System.out.print(s2[i] + " ");	
		}
	}
}