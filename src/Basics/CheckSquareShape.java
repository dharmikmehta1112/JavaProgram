package Basics;

import java.util.Scanner;

// ********** Using If Else and enter length & breadth, check shape is square/rectangle ***********

class CheckSquareShape{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length: ");
		double l = sc.nextDouble();
		System.out.print("Enter breadth: ");
		double b = sc.nextDouble();

		if(l==b)
			System.out.println("Shape is Square.");
		else
			System.out.println("Shape is Rectangle.");
	}
}