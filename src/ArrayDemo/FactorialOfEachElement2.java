package ArrayDemo;

import java.util.Scanner;

// Array ~ Home Work
// Print Factorial of each element of array.
// i used 1 more array to store factorial in array

public class FactorialOfEachElement2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

// Accept array A size from user
		System.out.print("Enter array size: ");
		int len = sc.nextInt();
		
// Accept array A elements from user
		int a[] = new int[len];
		int fact[] = new int[len];
		System.out.print("Enter array, " + len + " element separated by spaces: ");
		for (int i=0; i<len; i++) {
			a[i]=sc.nextInt();
		}
		
// Print accept array A
		System.out.print("You enter array: ");
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
// Initialize all values of Factorial Array to 1
		for (int i=0; i<fact.length; i++) {
			fact[i]=1;
		}
		
// Calculate and print factorial of each element of array A in Factorial Array
		System.out.println();
		for (int i=0; i<a.length; i++) {
			int x=1;
			while(a[i]>=x) {
				fact[i] = fact[i] * x;
				x++;
			}
			System.out.println("Factorial of array element " + a[i] + " is " + fact[i]);	
		}
	}
}