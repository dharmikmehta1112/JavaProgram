package ArrayDemo;

import java.util.Scanner;

public class FindSumEvenOdd {
	
	public static void main(String[] args) {
		
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array length: ");
		int length = sc.nextInt();
		int [] x = new int [length];
		System.out.println("Enter array " + length + "element separated by space: ");
		
		for (int i=0; i<length; i++) {
			x[i] = sc.nextInt();
		}
		
		for (int i=0; i<x.length; i++) {
				sum = sum + x[i];
		}
		
		if(sum%2==0)
			System.out.println("Sum " + sum + " is even.");
		else
			System.out.println("Sum " + sum + " is odd.");
	}
}