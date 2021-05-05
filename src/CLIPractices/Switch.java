package CLIPractices;
import java.util.Scanner;

public class Prime{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a digit: ");
		int a = sc.nextInt();

		if(a>1 && a%a==0)
			{
				if(a%2==1)
					System.out.println(a + " is not a prime number.");
				else
					System.out.println(a + " is prime number");
			}
		else
			System.out.println(a + " is not prime number");

		// switch(a%a)
		// {
		// 	case '0':
		// 			System.out.println(a + " is prime number.");
		// 			break;
		// 	default:
		// 			System.out.println(a + " is not prime number.");
		// 			break;
		// }

	}
}