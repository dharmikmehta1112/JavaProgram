package AllPatterns;
/*
2
4 4
6 6 6
8 8 8 8
*/

public class PatternNumber5
{
	public static void main(String[] args)
	{
		int k=2;
		for (int i=1; i<=4; i++)
		{
			for (int j=1; j<=i; j++)
			{
				System.out.print(k + " ");
			}
		System.out.println();
		k=k+2;		
		}	
	}
}