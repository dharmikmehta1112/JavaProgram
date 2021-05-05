package AllPatterns;
/*
*
* *
*   *
*     *
* * * * *
*/

/*
*

* *

*   *

*     *

* * * * *
*/

public class PatternStar3
{
	public static void main(String[] args)
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				if (j%i<=1 || i==5)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
			// System.out.println("\n");
		}
	}
}