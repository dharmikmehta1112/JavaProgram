package CLIPractice;

import java.util.Scanner;

public class PrintHelloUsingWhile {
	public static void main(String[] args) {
		int i=0;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.print("How many times you want to print Hello word = ");
		int count=sc.nextInt();
		while(i<count)
		{
			System.out.print("Hello ");
			i++;
		}
	}
 
}
