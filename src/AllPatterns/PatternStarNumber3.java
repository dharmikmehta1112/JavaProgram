package AllPatterns;
/*
      *
     * *
    * 1 *
  * 1 2 3 *
* * * * * * *
*/

/*
      *
     * *
    * 1 *
   * 1 2 *
  * 1 2 3 *
* * * * * * *
*/

public class PatternStarNumber3
{
	public static void main(String[] args)
	{
		for (int i=1; i<=6; i++)
		{
			if (i==4)
			i++;
			{
				for (int j=5; j>=i; j--)
				{
					System.out.print(" ");
				}
				for (int k=1; k<=i; k++)
				{
				// if((k%i==2 || k%i==3 || k%i==4) && i!=6)
					if(k%i>1 && i!=6)
						System.out.print(k-1 + " ");
					else
						System.out.print("* ");
				}
			}
		System.out.println();
		}
	}
}