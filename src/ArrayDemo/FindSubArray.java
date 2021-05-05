package ArrayDemo;

import java.util.Scanner;

// If the input array is [10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60],
// your program should be able to find that the subarray lies between the indexes 3 and 8.

public class FindSubArray {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
// Accept array A size from user
		System.out.print("Enter array size: ");
		int len = sc.nextInt();
		
// Accept array A elements from user
		int a[] = new int[len];
		int b[] = new int[6];
		System.out.print("Enter array, " + len + " elements separated by spaces: ");
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		
// Print array A all elements
		System.out.print("You enter array: ");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
// Finding subarray between the indexes 3 and 8
		int j=0;
		for (int i=0; i<a.length; i++) {
			if (i>=3 && i<=8) {
				b[j] = a[i];
				j++;
			}
		}
		
		System.out.print("\nSubarray between the index 3 and 8: ");
		
		for(j=0; j<b.length; j++) {
			System.out.print(b[j] + " ");
		}
	}
}