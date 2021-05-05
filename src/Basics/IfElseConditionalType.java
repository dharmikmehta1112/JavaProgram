package Basics;

import java.util.Scanner;

public class IfElseConditionalType{

	public static void main(String[] args) {
	// Creates an object of scanner
		Scanner in = new Scanner(System.in);		//class Scanner is in java.util package
	// System.out.print("Enter member age (yr) : ");		// add for user understanding
	// read the integer value
	// int age = in.nextInt();		// class scanner method: use to get/fetch/accept integer input from terminal
		
		System.out.print("Enter any interger value: ");
		int a = in.nextInt();
		
		/* if(a%5==0)
			System.out.println(a+" is divisble by 5."); 	// end of if condition
			System.out.println("Continue");
			System.out.println("Next");
			System.out.println("Testing");
		*/
		
		/* if(a%5==0)
			System.out.println(a+" is divisble by 5.");
		else
			System.out.println(a+" is not divisble by 5.");
		*/
		
		/* if(age<18 && age>0)
			System.out.println("Enter Age: " + age + ". You are Minor."); // end of if condition
			// System.out.println("Continue");
		else if (age>18 && age<60)
			System.out.println("Enter Age: " + age + ". You are Adult.");
		else if (age>=60 && age<120)
			System.out.println("Enter Age: " + age + ". You are Senior Citizen.");
		else if (age>120)
			System.out.println("Please enter a proper valid age.");
		else
			System.out.println("Please enter a valid age.");		
		*/
		
		/* if(a%3==0 && a%5==0 && a>0)
			System.out.println("Testing..");
		else if(a%5==0 && a>0)
			System.out.println("Hello!!");
		else if(a%3==0 && a>0)
			System.out.println("Hi..");
		else
			System.out.println("Enter valid");
		*/
		
		if (a%3==0 && a%5!=0)
			System.out.println("Hi");
		else if (a%5==0 && a%3!=0)
			System.out.println("Hello");
		else if (a%3==0 && a%5==0)
			System.out.println("Testing");
		else
			System.out.println("Enter a valid number");
		
		/* if(a%3==0 && a>0)
		{
			System.out.println("Hi..");
				if(a%5==0 && a>0)
					System.out.println("Hello!!");
				else if (a%3==0 && a%5==0 && a>0)
					System.out.println("Testing..");
		}
		else
			System.out.println("Enter valid");
		*/
		}
}