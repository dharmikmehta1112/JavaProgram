package CLIPractices;
// Multiplication of two matrices

import java.util.Scanner;
public class MatrixMultiplication
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of row required for Matrix: ");
		int row = sc.nextInt();
		System.out.print("Enter number of column required for Matrix: ");
		int column = sc.nextInt();
		int a[][] = new int[row][column];
		int b[][] = new int[column][row]; 
		int c[][] = new int[row][row];
		System.out.print("Enter matrix A (" +row+ " X " +column+ ") elements (separated by comma or spaces): ");
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<column; j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		System.out.print("Enter matrix B (" +column+ " X " +row+ ") elements (separated by comma or spaces): ");
		for(int i=0; i<column; i++)
		{
			for(int j=0; j<row; j++)
			{
				b[i][j] = sc.nextInt();
			}
		}
		System.out.println("=============================================================================");
		System.out.print("Matrix Multiplication C (" +row+ " X " +row+ ") elements: ");
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<row; j++)
			{
				c[i][j]=0;
				for (int k=0; k<column; k++)
				{
					c[i][j] = c[i][j] + (a[i][k]*b[k][j]);	
				}
			}
		}

		for(int i=0; i<row; i++)
		{
			for(int j=0; j<row; j++)
			{
				System.out.print(c[i][j] + " ");
			}
		}
		System.out.println("\n=============================================================================");
	}
}