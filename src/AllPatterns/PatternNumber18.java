package AllPatterns;
/*
1
3 3 3
5 5 5 5 5
7 7 7 7 7 7 7
9 9 9 9 9 9 9 9 9
*/

public class PatternNumber18
{
	public static void main(String[] srgs)
	{
		for (int i=1; i<10; i++)
		{
			if (i%2>0)
				i++;
				for (int j=1; j<i; j++)
				{
					System.out.print((i-1) + " ");	
				}
		System.out.println();
		}	
	}
}

// public class PatternNumber18
// {
// 	public static void main(String[] srgs)
// 	{
// 		int k=1;
// 		for (int i=1; i<=5; i++)
// 		{
// 			for (int j=1; j<=k; j++)
// 			{
// 				System.out.print(k + " ");	
// 			}
// 		System.out.println();
// 		k=k+2;
// 		}	
// 	}
// }