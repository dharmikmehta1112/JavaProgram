package AllPatterns;
/*
1 2
a b c
1 2 3 4
d e f g h
*/

/*
1 2
a b c
1 2 3 4
a b c d e
*/		

/*
1 2
a a a
1 2 3 4
a a a a a
*/

public class PatternAlphabetNumber2
{
	public static void main(String[] args)
	{
		// int k=97;			// Output 1
		for (int i=1; i<=4; i++)
		{
			int k=97;			// Output 2
			for (int j=1; j<=i+1; j++)
			{
			if (i%2==0)
			{
				// int k=97;			// Output 3
				System.out.print((char)k + " ");
				k++;
			}
			else
				System.out.print(j + " ");
			}
		System.out.println();
		}
	}
}