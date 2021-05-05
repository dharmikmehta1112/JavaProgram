package CLIPractices;
import java.util.Scanner;

// Take 3 number input by user and determine smallest and largest among them.

public class SmallestAndLargest3Number
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a = sc.nextInt();

		System.out.print("Enter second number: ");
		int b = sc.nextInt();

		System.out.print("Enter third number: ");
		int c = sc.nextInt();

// ****** Condition to check smallest among 3 number ********

		// if (a<b && a<c)
		// 	System.out.println("First number is smallest.");
		// else if (b<c)
		// 	System.out.println("Second number is smallest.");
		// else
		// 	System.out.println("Third number is smallest.");

// ****** Condition to check largest among 3 number ********

		// if (a>b && a>c)
		// 	System.out.println("First number is largest.");
		// else if (b>c)
		// 	System.out.println("Second number is largest.");
		// else
		// 	System.out.println("Third number is largest.");

		// if (a>b && a>c)
		// 	System.out.println("First number is largest.");
		// else if (b>a && b>c)
		// 	System.out.println("Second number is largest.");
		// else
		// 	System.out.println("Third number is largest.");

// ********* Using Ternary Operator ***********

		int ln = a>b?a:b;
		int ln1 = c>ln?c:ln;

		// int ln1 = c>(a>b?a:b)?c:(a>b?a:b);		// Using single statement

		System.out.println(ln1 + " is largest.");
	}
}