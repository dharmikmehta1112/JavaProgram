package AllPatterns;
/*
   a
  1 2
 a a a
1 2 3 4
*/		

public class PatternAlphabetNumber1
{
	public static void main(String[] args)
	{
		for (int i=1; i<=4; i++)
		{
			for (int j=3; j>=i; j--)
			{
				System.out.print(" ");
			}	
			for (int k=1; k<=i; k++)
			{
				if (i%2!=0)
				{
					for(int l=1; l<=i; l++)
					{
						k=97;
						System.out.print((char)k + " ");
					}
				}	
				else
				System.out.print(k + " ");
			}
		System.out.println();
		}
	}
}