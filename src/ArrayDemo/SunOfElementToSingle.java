package ArrayDemo;

import java.util.Scanner;

// Array ~ Home Work
// Add all elements of array to single digit result x = {11, 22, 33, 44} = 110 = 2

public class SunOfElementToSingle {
	
	public static void main(String[] args) {
		int rem=0, sum=0, sum1=0;
		Scanner sc = new Scanner(System.in);
		
// Accept array A size from user
		System.out.print("Enter array size: ");
		int len = sc.nextInt();
		
// Accept array A elements from user 
		int a[] = new int[len];
		System.out.print("Enter array, " + len + " elements separated by spaces: ");
		for (int i=0; i<len; i++) {
			a[i] = sc.nextInt();
		}
		
// Print array A and sum of all elements
		System.out.print("You enter array: ");
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
			sum = sum + a[i];
		}
		System.out.println("\nSum of all elements of array: " + sum);
		
// Calculate and print sum of all elements of array to single digit
		while(sum>0) {
			rem = sum%10;
			sum1 = sum1+rem;
			sum = sum/10;
		}
		System.out.println("Sum of all elements of array to single digit: " + sum1);
	}
}