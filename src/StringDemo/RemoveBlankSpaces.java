package StringDemo;

import java.util.Scanner;

public class RemoveBlankSpaces 
{	
// Using replaceAll() method	
	public void usingreplaceAll(String str)
	{
		str = str.trim().replaceAll(" ", "");
		System.out.println("String without blank spaces (using replaceAll() method):: " +str);
	}
	
// Using for loop with charAt() method	
	public void usingForLoopWithCharAt(String str)
	{
		str = str.trim();
		int str_len = str.length();
		String str2 = "";
		for (int i = 0; i < str_len; i++)
		{
			if(str.charAt(i)!=' ') 
			{
				str2 = str2 + str.charAt(i);
			}
		}
		System.out.println("String without blank spaces (using for loog with charAt() method):: " +str2);
	}
	
// Convert String into character array and use for loop	
	public void convertStringToCharArrayAndForLoop(String str)
	{	
		str = str.trim();
		int len = str.length();
		String str2 = "";
		char ch[] = str.toCharArray();
		
		for (int i = 0; i < ch.length; i++)
		{
			if(ch[i]!=' ')
			{
				str2 = str2 + ch[i];
			}
		}
		
		System.out.println("String without blank spaces (convert String into Character array and use for loop):: " +str2);
	}

	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a statement:: ");
		String st = sc.nextLine();
		new RemoveBlankSpaces().usingForLoopWithCharAt(st);
		new RemoveBlankSpaces().convertStringToCharArrayAndForLoop(st);
		new RemoveBlankSpaces().usingreplaceAll(st);
	}
}