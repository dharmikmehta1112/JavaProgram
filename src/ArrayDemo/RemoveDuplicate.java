package ArrayDemo;

import java.util.Scanner;

// Find duplicate elements in an array.

public class RemoveDuplicate {
	
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
		
// Find duplicate elements of an array
		int count=0;
		for (int i=0; i<a.length; i++) {
			for (int j=i; j<a.length; j++) {
				if (a[i]==a[j] && i!=j) {
					System.out.print("\nValue as" + a[i] + " is same at position " + i + " and " + j + ".");
					count++;
				}
			}
		}
		System.out.println("\nNumber of duplicate elements: " + count);
		if (count==0)
			System.out.println("No duplicate elements in an array.");
	}
}