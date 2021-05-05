package ArrayDemo;

import java.util.Scanner;

// Array ~ Home Work
// Print missing number from series. I/P X = {1,4,7,9,14} = {2,3,5,6,8,10,11,12,13}

public class MissingNumberInRange {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int len = sc.nextInt();
		int[] a = new int[len];
		
		System.out.print("Enter array, " + len + " elements separted by spaces: ");
		for (int i=0; i<a.length; i++){
			a[i] = sc.nextInt();	
		}
		
		System.out.print("You enter array: ");
		for (int i=0; i<a.length; i++){
			System.out.print(a[i] + " ");
		}
		System.out.println();

//Logic 1 ~ VG

		// int n = a[0];											// 1
		// for (int i=1; i<a.length; i++)							// i=1, 2, 3
		// {
		// 	if((n+1)!= a[i])										// true, 5!=7~true
		// 	{
		// 		n++;		     // to skip a[] array elements		// 2, 5
		// 		while(n<a[i])										// 2<4=true  3<4=true   false ~ 5<7=true
		// 		{
		// 			System.out.print(n + " ");						//2, 3, 5, 6
		// 			n++;											//3, 4, 6, 7
		// 		}			
		// 	}
		// }

// Logic 2 ~ DM 							// Exception
// a = {1,4,7,9,14}

		// for (int i=0; i<a.length; i++)					// 0, 1
		// {
		// 	int j=i;										// j=0, 1
		// 	int c = a[j];									// c=1, 4
		// 	if (a[j+1]-a[j]>1)								// 4-1>1 true    7-4>1
		// 	{
		// 		c++;
		// 		while(c<a[j+1])								// 1<4	2<4 3<4 4<4~false    4<7
		// 		{								
		// 			System.out.print(c + " ");				// O/p - 2, 3, 4
		// 			c++;									// 2	3   4
		// 		}
		// 	}
		// }

// Logic 3

		for (int i=0; i<a.length; i++)						// 0, 1
		{
			int j=i;										// j=0, 1
			int c = a[j];									// c=1, 4
			if (a[j+1]-a[j]>1)								// 4-1>1 true    7-4>1
			{
				c++;
				while(c<a[j+1])								// 1<4	2<4 3<4 4<4~false    4<7
				{								
					a[i]++;
					System.out.print(a[i] + " ");			// O/p - 2, 3, 4
					c++;									// 2	3   4
				}
			}
		}
	}	
}