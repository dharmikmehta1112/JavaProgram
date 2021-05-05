package ArrayDemo;

// Find all the missing number in an array of series.

import java.util.Scanner;

public class MissingNumberInSeries {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.print("Enter array " + size + " elememts randomly separated by space: ");
		
		for (int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Enter array: ");
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
// Unsorted array and will have series of n numbers from 1 eg. 2 6 1 3 7 4 8

		// int n = arr.length + 1;
		// int sum = (n*(n+1))/2;
		// for (int i=0; i<arr.length; i++) {
		// 	sum = sum - arr[i];
		// }
		// System.out.println("The missing number in series: " + sum);

// Unsorted array and will have number in random but series of n numbers and not from 1 eg. 9 6 12 7 11 8

		int asort, sum=0;
		for (int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++)	{
				if(arr[i]<arr[j]) {
					asort = arr[i];
					arr[i] = arr[j];
					arr[j] = asort;
				}
			}
		}
	
		System.out.print("\nSorted Array in ascending Order: ");
		
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");	
		}

		int max = arr[(arr.length)-1];
		int min = arr[0];
		
		System.out.println("\nMaximum value in array: " + max);
		System.out.println("Minimum value in array: " + min);
		
		for(int i=min; i<=max; i++) {
			sum = sum + i;
		}
		for(int i=0; i<arr.length; i++) {
			sum = sum - arr[i];
		}
		System.out.println("The missing number in series: " + sum);
	}
}