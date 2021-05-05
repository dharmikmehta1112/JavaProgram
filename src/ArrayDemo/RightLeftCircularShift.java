package ArrayDemo;
import java.util.Scanner;

// Write a program to shift every element of an array to circularly right and left.

public class RightLeftCircularShift {
	
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
		
// // Shift every array element to circularly right		a -> b -> c -> d  ==> d -> a -> b-> c 
// 		int temp=a[len-1];
// 		for (int i=a.length-1; i>0; i--) {
// 			a[i]=a[i-1];
// 		}
// 		a[0]=temp;
		
// // Print right shift circular array
// 		System.out.print("\nRight shift circular array: ");
// 		for(int i=0; i<a.length; i++) {
// 			System.out.print(a[i] + " ");
// 		}
		
// Shift every array element to circularly left			a <- b <- c <- d  ==> b <- c <- d <- a
		int temp=a[0];
		for (int i=0; i<a.length-1; i++) {
			a[i]=a[i+1];
		}
		a[len-1]=temp;
		
// Print left shift circular array
		System.out.print("\nLeft shift circular array: ");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}