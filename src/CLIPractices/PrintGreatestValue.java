package CLIPractices;
import java.util.Scanner;

// ************ Using If Else ~ Take 2 integer value and print greatest among them.**************

public class PrintGreatestValue{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first integer value: ");
		int a = sc.nextInt();
		System.out.print("Enter second integer value: ");
		int b = sc.nextInt();

		if(a>b)
			System.out.println(a + " is greater than " + b + ".");
		else if (a<b)
			System.out.println(b + " is greater than " + a + ".");
		else
			System.out.println("Enter a valid interger value.");
	}
}