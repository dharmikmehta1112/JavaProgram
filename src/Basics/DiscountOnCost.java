package Basics;

import java.util.Scanner;

// ************ Using If Else ~ Discount of 10% if the cost of purchased quantity is more than 1000. Assue one unit will cost 100.

public class DiscountOnCost {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter quantity: ");
		int q = sc.nextInt();

		// int cost = q * 100;
		// double disc = .1 * cost;
		// int disc_cost = cost - (int)disc;
		
		if ((q*100)>1000)
			System.out.println("You get a discount of: " + (.1*q*100) + " and your total cost is: " + ((q*100)-(.1*q*100)));
			// System.out.println("You get a discount of: " + disc + " and your total cost is: " + disc_cost);
		else
			System.out.println("No discount");
	}
}