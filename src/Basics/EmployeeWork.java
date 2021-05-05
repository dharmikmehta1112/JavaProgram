package Basics;

import java.util.Scanner;

/* Ask user to enter age, sex ( M or F ), marital status ( Y or N ) and then using following rules print their place of service.
if employee is female, then she will work only in urban areas.
if employee is a male and age is in between 20 to 40 then he may work in anywhere
if employee is male and age is in between 40 t0 60 then he will work in urban areas only.
And any other input of age should print "ERROR". */

public class EmployeeWork {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter age (yr): ");
		float age = keyboard.nextFloat();
		System.out.print("Enter sex (M / F): ");
		char sex = keyboard.next().charAt(0);
		System.out.print("Enter maritial status (Y / N): ");
		char marital = keyboard.next().charAt(0);

		if(sex == 'F')
			System.out.println("You can work only in urban areas.");
		else if(sex == 'M' && age>=20 && age<40)
			System.out.println("You can work in anywhere.");
		else if(sex == 'M' && age>=40 && age<60)
			System.out.println("You can work in urban areas only.");
		else
			System.out.println("ERROR");
	}
}