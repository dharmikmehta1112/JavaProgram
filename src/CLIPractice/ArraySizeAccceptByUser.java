package CLIPractice;

import java.util.Scanner;

public class ArraySizeAccceptByUser 
{
public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	int size,i;
	System.out.print("Enter Size of Array = ");
	size=sc.nextInt();
	int [] x=new int[size];
	System.out.print("Enter the array elements =");
	for(i=0;i<x.length;i++)
	{
		x[i]=sc.nextInt();
	}
	System.out.print("Array List = ");
	for(i=0;i<x.length;i++)
	{
	System.out.print(" "+x[i]);	
	}
	
}
}
