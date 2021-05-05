package Basics;

import java.util.Scanner;

//********* A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
//********* Ask user for their salary and year of service and print the net bonus amount.

public class EmployeeBonus {
	
public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter service period (yr): ");
	float yr = sc.nextFloat();
	System.out.print("Enter net salary: ");
	double sal = sc.nextDouble();
	if(yr>5)
		System.out.println("Net Bonus Amount: " + (.05*sal));
	else
		System.out.println("No Bonus.");
}	
}