package ArrayDemo;

import java.util.Scanner;

// Take 20 integer inputs from user and print the following:
// number of positive numbers, number of negative numbers, number of odd numbers, number of even numbers, number of 0s.

public class FindTypeCheck {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int len = 5, p=0, n=0, o=0, e=0, z=0;
		
// Accept array A elements from user
		int a[] = new int[len];
		System.out.print("Enter array, " + len + " integer inputs separated by spaces: ");
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		
// Print array A all elements
		System.out.print("You enter array: ");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
// Check and Print number of positive numbers / negative numbers / odd numbers / even numbers / 0s
		for (int i=0; i<a.length; i++) {
			if(a[i]>0) {
				p++;
				if(a[i]%2==0)
					e++;
				else
					o++;
			}
			else if(a[i]<0)
				n++;
			else if(a[i]==0)
				z++;
		}
		
		System.out.println("\nNumber of Postive Number in an array: " + p);
		System.out.println("Number of Negative Number in an array: " + n);
		System.out.println("Number of Odd Number in an array: " + o);
		System.out.println("Number of Even Number in an array: " + e);
		System.out.println("Number of Zeros Number in an array: " + z);
	}
}