package CLIPractices;
class MultiArray
{

	public static void main(String[] args)
	{
		// int[][] multiArray = new int[2][3];
		
		int[][] multiArray1 = {{2,4,6},{8,10,12}};
		
		for(int i = 0; i < multiArray1.length; i++)
		{
			for(int j = 0; j < multiArray1[i].length; j++)
			{
				System.out.println("Value at [" + i + "][" + j + "] is " + multiArray1[i][j]);
				// System.out.println("Value = " + multiArray1[i][j]);
			}
		}
	}
} 