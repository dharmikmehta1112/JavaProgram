package AllPatterns;
/*
   1
  * *
 1 2 3
* * * *

*/

public class PatternStarNumber1
{
	public static void main(String[] args)
	{
		for(int i=1; i<=4; i++)		// select line or row
		{
			for(int k=3;k>=i;k--)		// print space
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)			// print asterik and space
			{
				if(i%2!=0)					// select odd line
					System.out.print(j + " ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}
	}
}