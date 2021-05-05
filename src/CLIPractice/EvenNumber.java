package CLIPractice;

import java.util.Scanner;

public class EvenNumber {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int i, size;
		System.out.print("How many element you want to enter = ");
		size =sc.nextInt();
		int a[] = new int[size];
		for (i = 0; i < a.length; i++) {
		System.out.print("Enter the Element = ");
					a[i] = sc.nextInt();
		}
		System.out.print("Even Number = ");
		for (i = 0; i < a.length; i++) 
		{
	       if(a[i]%2 == 0)
	       {
	    	   System.out.print(a[i]+" ");
	       }
		}

}
}
