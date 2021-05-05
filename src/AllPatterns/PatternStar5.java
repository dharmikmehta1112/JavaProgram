package AllPatterns;
/*
*
*  *  *
*  *  *  *  *
*  *  *  *  *  *  *
*  *  *  *  *  *  *  *  *
*/

// public class PatternStar5
// {
// 	public static void main(String[] srgs)
// 	{
// 		for (int i=1; i<10; i++)
// 		{
// 			if (i%2>0)
// 				i++;
// 				for (int j=1; j<i; j++)
// 				{
// 					System.out.print("*  ");	
// 				}
// 		System.out.println();
// 		}	
// 	}
// }

public class PatternStar5
{
	public static void main(String[] srgs)
	{
		int k=1;
		for (int i=1; i<=5; i++)
		{
			for (int j=1; j<=k; j++)
			{
				System.out.print("*  ");	
			}
		System.out.println();
		k=k+2;
		}	
	}
}

