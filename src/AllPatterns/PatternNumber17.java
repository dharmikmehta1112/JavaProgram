package AllPatterns;
/*
1
1 2 3
1 2 3 4 5
1 2 3 4 5 6 7
1 2 3 4 5 6 7 8 9
*/

// public class PatternNumber17
// {
// 	public static void main(String[] srgs)
// 	{
// 		for (int i=1; i<10; i++)
// 		{
// 			if (i%2>0)
// 				i++;
// 				for (int j=1; j<i; j++)
// 				{
// 					System.out.print(j + " ");	
// 				}
// 		System.out.println();
// 		}	
// 	}
// }

public class PatternNumber17
{
	public static void main(String[] srgs)
	{
		int k=1;
		for (int i=1; i<=5; i++)
		{
			for (int j=1; j<=k; j++)
			{
				System.out.print(j + " ");	
			}
		System.out.println();
		k=k+2;
		}	
	}
}