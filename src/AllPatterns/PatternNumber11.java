package AllPatterns;
/*
7 6 5 4 3 2 1
6 5 4 3 2 1
5 4 3 2 1
4 3 2 1
3 2 1
2 1
1
*/

public class PatternNumber11
{
	public static void main(String[] args)
	{
		for(int i=7; i>=1; i--)
		{
			int k=i;
			for(int j=1; j<=i; j++)
			{
				System.out.print(k + " ");
				k--;
			}
		System.out.println();
		}
	}
}