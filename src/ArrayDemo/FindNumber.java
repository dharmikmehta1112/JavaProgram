package ArrayDemo;

import java.util.Scanner;

// Take 10 integer inputs from user and store them in an array. Again ask user to give a number.
// Now, tell user whether that number is present in array or not.

public class FindNumber {
	
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
		
// Accept any number from user
		System.out.print("\nEnter a number to check in array: ");
		int num = sc.nextInt();
		
// Check and Print number is present in array or not
		// for (int i=0; i<a.length; i++){
		// 	if(num == a[i]){
		// 		System.out.println("Number " + num + " is present in array at index " + i +  ".");
		// 		break;
		// 	} else
		// 		System.out.println("Number " + num + " is not present in array at index " + i + ".");
		// }
		int flag=0;
		for (int i=0; i<a.length; i++) {
			if(num==a[i]) {
				flag=1;
					System.out.println("Number " + num + " is present in array at index " + i +  ".");
			}
		}
		if(flag==0)
			System.out.println("Number " + num + " is not present in array.");
	}
}