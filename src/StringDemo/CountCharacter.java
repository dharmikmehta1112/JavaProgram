package StringDemo;

// **WAP to perform given operation. I/P TTTEESSSSTTTTIIIIINNG. O/P T3E2S4T4I5N2G1

import java.util.Scanner;

public class CountCharacter 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter input string: ");
		String s = sc.nextLine();
		System.out.println("Length of input sting:: "+s.length());
		CountCharacter cc = new CountCharacter();
//		cc.CountChar(s);
		cc.charCount(s);
		
	}
	
	public void charCount(String st)
	{
//		st = st.toLowerCase();
		
		for(int i = 0; i < st.length(); i++)
		{
			int count = 0;
			char c = st.charAt(i);
			if(((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) && c!=' ')
			{
				for (int j = 0; j <= i; j++) 
				{				
					if(c==st.charAt(j)) 
						count++;
				}
			}
			System.out.print((char)c+ "" +count + " ");
		}
		
	}

//	public void CountChar(String str) 
//	{
//		String rev = "";
//		int j = str.length();
//		System.out.println("Length of input string:: " + j);
//		for(int i=0; i<j; i++)
//		{
//			int count=1;
//			if(str.charAt(i) == str.charAt(i+1) && str.charAt(i+1)!=' ')
//			{
//				count++;
//			}
//			rev = str.charAt(i) + count;
//			System.out.print(rev);
//		}
//		System.out.print("\nOutput String:: " +rev);
//	}
	
}