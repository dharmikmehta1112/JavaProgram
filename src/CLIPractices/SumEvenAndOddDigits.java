package CLIPractices;
import java.util.Scanner;

// *********** Sum of even and odd digits in a number **********

public class SumEvenAndOddDigits
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();

		int even_count = 0;
		int odd_count = 0;
		int even_sum = 0;
		int odd_sum = 0;

		while(num>0)
		{
			int rem = num % 10;
			if(rem%2 == 0)
			{
				even_count++;
				even_sum = even_sum + rem;
			}
			else
			{
				odd_count++;
				odd_sum = odd_sum + rem;
			}
			num = num / 10;
		}
		System.out.println("Even Digits: " + even_count + " and Odd Digits: " + odd_count);
		System.out.println("Sum of Even Digits: " + even_sum + " and Sum of Odd Digits: " + odd_sum);
	}
}