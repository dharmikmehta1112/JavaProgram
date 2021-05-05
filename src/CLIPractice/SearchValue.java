package CLIPractice;

import java.util.Scanner;

public class SearchValue {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int arr[]={4,5,6,7,8,9};
		System.out.print("Enter Number = ");
		int x=sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			if(x==arr[i])
			{
				System.out.println("Number is present in array at index "+i);
			}
			
		}
	}

}
