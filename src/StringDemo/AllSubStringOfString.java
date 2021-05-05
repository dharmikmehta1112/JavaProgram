package StringDemo;

// WAP to find all subsets of a string

// subset = n(n+1)/2	n --> length of string

public class AllSubStringOfString 
{	
	public void getSubStringOfString(String s) 
	{	
		int len = s.length();
		int count = 0;
		
		System.out.println("'Length' of string \"" +s+ "\":: " +len);
			
		System.out.print("All sub string of \"" +s+ "\":: ");
		
		for (int i = 0; i < len; i++)
		{
			for (int j = i; j < len; j++) 
			{
				System.out.print(s.substring(i, j+1) + ", ");			// length of substring = (j - i)
				count++;
			}
		}
		System.out.print("\nTotal number of substring:: " +count);
	}

	public static void main(String[] args) 
	{	
		String s = "CAT";
		
		new AllSubStringOfString().getSubStringOfString(s);
	}

}