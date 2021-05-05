package Basics;

import java.util.Scanner;

// *********** Using If Else check number of digit in enter number **************

public class CheckDigit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int a = sc.nextInt();

		if(a>1 && a<10)
			System.out.println(a + " is a 1 digit number.");
		else if(a>=10 && a<100)
			System.out.println(a + " is a 2 digit number.");
		else if(a>=100 && a<1000)
			System.out.println(a + " is a 3 digit number.");
		else if(a>=1000 && a<10000)
			System.out.println(a + " is a 4 digit number.");
		else if(a>=10000 && a<100000)
			System.out.println(a + " is a 5 digit number.");
		else if(a>=100000 && a<1000000)
			System.out.println(a + " is a 6 digit number.");
		else
			System.out.println("Only 6 digit number is allowed.");
	}
}