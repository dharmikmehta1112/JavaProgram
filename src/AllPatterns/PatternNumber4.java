package AllPatterns;
/*
    1
   2 3
  4 5 6
 7 8 9 10
11 12 13 14 15
*/

public class PatternNumber4
{
	public static void main(String[] args)
	{
		int l=1;
		for(int i=1; i<=5; i++)
		{
			for (int j=4; j>=i; j--)
			{
				System.out.print(" ");	
			}
			for (int k=1; k<=i; k++)
			{
				System.out.print(l + " ");
				l++;
			}
		System.out.println();
		}
	}
}