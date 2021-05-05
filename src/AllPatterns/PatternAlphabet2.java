package AllPatterns;
/*
a
a b
a b c
a b c d
*/

public class PatternAlphabet2
{
	public static void main(String[] args)
	{
		
		for (int i=1; i<=4; i++)
		{
			int k = 97;
			for (int j=1; j<=i; j++)
			{
				System.out.print((char)k + " ");
				k++;
			}	
		System.out.println();
		}
	}
}