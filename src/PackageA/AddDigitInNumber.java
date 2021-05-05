// WAP to add all digits in a number.

package PackageA;

import java.util.Scanner;

public class AddDigitInNumber {
	public static void main(String[] args) {
		int sum = 0, rem;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		while(num>0) {
			rem = num%10;
			sum = sum+rem;
			num = num/10;
		}
		System.out.println("Sum of all digits in a given number: " +sum);
	}
}