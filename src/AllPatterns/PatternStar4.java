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

public class PatternStar4
{
	public static void main(String[] args)
	{
		for(int i=1; i<=5; i++)
		{
			for(int k=5;k>i;k--)
			{
				System.out.print(" ");		// 1 Space
			}
			for(int j=1; j<=i; j++)
			{
				if (j%i<=1 || i==5)
					System.out.print("* ");
				else
					System.out.print("  ");		// 2 Space
			}
			System.out.println();
			// System.out.println("\n");
		}
	}
}