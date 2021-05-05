package CLIPractices;
import java.util.Scanner;

/* s = "abccabbc". The output should be abcca, bccab, bccabb, cc, cabbc. The first and last char should be same. */

public class SubStringCheckFirstAndLastChar
{
	public static void main(String[] args)
	{
		// Scanner sc = new Scanner(System.in);
		// System.out.print("Enter a String: ");
		// String str = sc.next();

		String s = "abccabbc";
		char a[] = s.toCharArray();
		int len = a.length;

		System.out.println("Original String: " + s);
		for(int i=0; i<len; i++)
		{
			System.out.print("Sub String " + (i+1) + ": ");
			System.out.print(a[i]);
			for(int j=i; j<len; j++)
			{
				if (a[j] == a[i])
					break;
				else
					System.out.print(a[j]);
			}
			System.out.println();
		}
	}	
}