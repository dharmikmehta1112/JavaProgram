package AllPatterns;
/*
a
b c
d e f
g h i j
*/

public class PatternAlphabet1
{
	public static void main(String[] args)
	{
		int k = 97;
		for (int i=1; i<=4; i++)
		{
			for (int j=1; j<=i; j++)
			{
				System.out.print((char)k + " ");
				k++;
			}	
		System.out.println();
		}
	}
}