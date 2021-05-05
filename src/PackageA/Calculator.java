package PackageA;

import java.util.Scanner;

public class Calculator {
	
	public static int add(int x, int y) {
		return x+y;
	} public int sub(int x, int y) {
		return x-y;
	} public int mul(int x, int y) {
		return x*y;
	} public double div(int x, int y) {
		if(y==0) {
			System.out.println("Division cannot take place if number 2 is 0.");
			return 0;
		} else
			return x/y;
	}	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 integer values: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		Calculator obj = new Calculator();
		int d;
		do {
			System.out.println("Enter choice of operation: \n1. Addition \n2. Substraction \n3. Multiplication \n4. Division");
			int choice = sc.nextInt();
		switch(choice){
			case 1: System.out.println("Addition of 2 enter number: " + add(a,b));					// static method can be call directly or 
//					System.out.println("Addition of 2 enter number: " + Calculator.add(a,b));		// by class name also
					break;
			case 2: System.out.println("Substraction of 2 enter number: " + obj.sub(a,b));
					break;
			case 3: System.out.println("Multiplication of 2 enter number: " + obj.mul(a,b));
					break;
			case 4: System.out.println("Division of 2 enter number: " + obj.div(a,b));
					break;
			case 5: System.out.println("Stay Home, Stay Safe.");
					System.exit(0);
			default: System.out.print("\nInvalid option.\nEnter choice as per menu list.");
				}
		System.out.print("\nDo you like to continue. Enter 1 for Yes and 0 for No.");
		d = sc.nextInt();
		} while(d==1);
	}
}