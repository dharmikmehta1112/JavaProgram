package AllPatterns;
public class PatternUsingWhile
{
	public static void main(String[] args)
	{
		// int i = 1, j;
		// while(i<=4)
		// {
		// 	j = 1;
		// 	while(j<=i)
		// 	{
		// 		System.out.print("* ");
		// 		j++;
		// 	}
		// System.out.println();
		// i++;
		// }

		// int i = 4, j;
		// while(i>=1)
		// {
		// 	j = 1;
		// 	while(j<=i)
		// 	{
		// 		System.out.print("* ");
		// 		j++;
		// 	}
		// System.out.println();
		// i--;

		// int i = 1, j;
		// while(i<=4)
		// {
		// 	j = 1;
		// 	while(j<=i)
		// 	{
		// 		System.out.print(j + " ");
		// 		j++;
		// 	}
		// System.out.println();
		// i++;

		// int i=97, j, k=97;
		// while(i<=100)
		// {
		// 	j = 97;
		// 	while(j<=i)
		// 	{
		// 		System.out.print((char)k+" ");
		// 		j++;
		// 		k++;
		// 	}
		// System.out.println();
		// i++;

		// int i=1, j, k;
		// while(i<=4)
		// {
		// 	j=1;
		// 	k=97;
		// 	while(j<=i)
		// 	{
		// 		if(i%2!=0)
		// 			{
		// 				System.out.print((char)k + " ");
		// 				k++;
		// 			}
		// 		else
		// 			System.out.print(j + " ");
		// 		j++;
		// 	}
		// System.out.println();
		// i++;

		int i=1, j, k;
		while(i<=4)
		{
			j=1;
			k=97;
			while(j<=i)
			{
				if(i%3==1)
				{
					System.out.print((char)k + " ");
					k++;
				}
				else if(i%3==2)
					System.out.print(j + " ");
				else
					System.out.print('*' + " ");
				j++;
			}
		System.out.println();
		i++;
		}
	}
}