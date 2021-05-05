package Basics;

import java.util.Scanner;

// Take input of age of 3 people by user and determine oldest and youngest among them.

public class AgeComparisonUsingIfElseIf
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter age of first person (yr): ");
		float fst_age = sc.nextFloat();
		System.out.print("Enter age of second person (yr): ");
		float sec_age = sc.nextFloat();
		System.out.print("Enter age of third person (yr): ");
		float thd_age = sc.nextFloat();

// ****** Condition to check Youngest among 3 people ********

		if (fst_age<sec_age && fst_age<thd_age)
			System.out.println("First person is youngest.");
		else if (sec_age<thd_age)
			System.out.println("Second person is youngest.");
		else
			System.out.println("Third person is youngest.");

// ****** Condition to check Oldest among 3 people ********

		if (fst_age>sec_age && fst_age>thd_age)
			System.out.println("First person is oldest.");
		else if (sec_age>thd_age)
			System.out.println("Second person is oldest.");
		else
			System.out.println("Third person is oldest.");
	}
}