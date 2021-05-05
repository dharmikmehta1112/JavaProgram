package CLIPractices;
import java.util.Scanner;

// ******* Reverse a number enter by a user.*******

public class ReverseANumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to reverse: ");
		int num = sc.nextInt();

		int temp = num, rem, sum = 0;

		System.out.println("Orginal number: " + num);

		while(temp>0)
		{
			rem = temp%10;
			sum = sum*10 + rem;
			temp = temp/10;
		}

		System.out.println("Reverse number: " + sum);
	}
}