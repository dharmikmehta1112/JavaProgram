package CLIPractice;

import java.util.Scanner;

public class EvenOddNumber {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s1 = new Scanner(System.in);
		int i, size;
		System.out.print("How many element you want to enter = ");
		size = s1.nextInt();
		int a[] = new int[size];

		System.out.print("Enter the Number = ");
		for (i = 0; i < a.length; i++) {
			a[i] = s1.nextInt();
		}
		System.out.println("Even Number = ");
		for (i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.print(" " + a[i]);
			}
		}
		System.out.println(" ");
		System.out.println("Odd Number = ");
		for (i = 0; i < a.length; i++) {
			if (a[i]%2 != 0) {
				System.out.print(" " + a[i]);
			}
		}

	}

}
