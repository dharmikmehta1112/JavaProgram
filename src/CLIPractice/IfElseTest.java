package CLIPractice;

import java.util.Scanner;

public class IfElseTest {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the 1st frnd age = ");
		int a=sc.nextInt();
		System.out.print("Enter 2nd frnd age = ");
		int b=sc.nextInt();
		if(a<b)
		{
			System.out.println("1st is younger");
		}
		else
			System.out.println("2nd is younger");
	}

}
