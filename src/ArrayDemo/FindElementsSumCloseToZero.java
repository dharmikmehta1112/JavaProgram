package ArrayDemo;

// WAP to sum the pair of element in the array and display the pair who's sum is close to zero.
// e.g. a = {1,2,3,-3,-2}, the output of program should be the pair as 3 & -3, as the sum of these two are zero or close to zero.

public class FindElementsSumCloseToZero
{	
	private static void findElementsSumNearCloseToZero(int[] a)
	{	
		int min_sum = a[0] + a[1], sum, num1 = a[0], num2 = a[1	];
		
		if(a.length<2) {
			System.out.println("Invalid input");
			return;
		}
		
		for (int i = 0; i < a.length-1; i++)
		{
			for (int j = i+1; j < a.length; j++)
			{
				sum = a[i] + a[j];
				if(Math.abs(min_sum) > Math.abs(sum))
				{
					min_sum = sum;	
					num1 = i;
					num2 = j;
				} 
			}
		}

		System.out.println("The 2 elements whose sum is zero or close to zero are " +a[num1]+ " and " +a[num2]);
	}
	
	public static void main(String[] args)
	{
//		int[] a = {1,2,3,-3,-2};
		
		int[] a = {1,60,-10,66,-70, 75};
		
		findElementsSumNearCloseToZero(a);
		
	}

}
