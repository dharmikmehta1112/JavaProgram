package Basics;
import java.util.Scanner;

// Using If Else ~ WAP to print absolute value of a number entered by user.
// E.g.- INPUT: 1, OUTPUT: 1 and INPUT: -1, OUTPUT: 1

public class AbsoluteValue
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();

		if (n<0)
			System.out.println("Absolute Value: " +(-1*n));
		else
			System.out.println("Absolute Value: " +n);
	}
}