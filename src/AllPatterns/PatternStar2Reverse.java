package AllPatterns;
/*
 * * * *
  * * *
   * *
    *
*/

public class PatternStar2Reverse
{
	public static void main(String[] args)
	{
		for(int i=1; i<=4; i++)		// line or row
		{
			for(int k=1;k<=i;k++)		// space
			{
				System.out.print(" ");
			}
			for(int j=4; j>=i; j--)		// asterik and space
			{
				System.out.print("* ");
			}
		System.out.println();
		}	
	}
}