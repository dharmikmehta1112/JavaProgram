package CLIPractices;
import java.util.Scanner;

/* A 4 digit number is entered through keyboard. Write a program to print a new number with digits reversed as of orignal one.
E.g.- INPUT : 1234        OUTPUT : 4321			INPUT : 5982        OUTPUT : 2895 */

public class FourDigitReverse
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a 4 digit number: ");
		int num = keyboard.nextInt();

		int digit1 = (num/1)%10;
		int digit2 = (num/10)%10;
		int digit3 = (num/100)%10;
		int digit4 = (num/1000)%10;
	
		
		if(num>=1000 && num<=9999)
			System.out.println("Reverse 4 digit number: " + digit1 + digit2 + digit3 + digit4);
		else
			System.out.println("Invalid 4 digit number.");
	}
}