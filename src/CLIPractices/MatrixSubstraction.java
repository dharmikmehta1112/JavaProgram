package CLIPractices;
// Substraction of two matrices

import java.util.Scanner;
public class MatrixSubstraction
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of row required for Matrix: ");
		int row = sc.nextInt();
		System.out.print("Enter number of column required for Matrix: ");
		int column = sc.nextInt();
		int a[][] = new int[row][column];
		int b[][] = new int[row][column]; 
		int c[][] = new int[row][column];
		System.out.print("Enter matrix A (" +row+ " X " +column+ ") elements (separated by comma or spaces): ");
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<column; j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		System.out.print("Enter matrix B (" +row+ " X " +column+ ") elements (separated by comma or spaces): ");
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<column; j++)
			{
				b[i][j] = sc.nextInt();
			}
		}
		System.out.println("=============================================================================");
		System.out.print("Matrix Substraction C (" +row+ " X " +column+ ") elements: ");
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<column; j++)
			{
				c[i][j] = a[i][j] - b[i][j];
			}
		}

		for(int i=0; i<row; i++)
		{
			for(int j=0; j<column; j++)
			{
				System.out.print(c[i][j] + " ");
			}
		}
		System.out.println("\n=============================================================================");
	}
}