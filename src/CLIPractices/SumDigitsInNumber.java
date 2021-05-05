package CLIPractices;
import java.util.Scanner;

//****** Claculate sum of digits in a number ******* */

public class SumDigitsInNumber
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		while(num>0)
		{
			int unum = num%10;
			sum = sum + unum;
			num = num/10;
		}
		
		System.out.println("Sum of Digits: " + sum);
	}	
}