package StringDemo;

public class SwapFirstLastCharOfEachWord 
{
	private String replaceCharPosition(String s)
	{
		char[] arr = s.toCharArray();
		for (int i = 0; i < arr.length; i++) 
		{
			int k = i;					// k stores index of first character
            
			while(i<arr.length && arr[i]!=' ')
				i++;					// i store index of last character

				char temp = arr[k];
				arr[k] = arr[i-1];
				arr[i-1] = temp;			
		}
		return new String(arr);
	}
	
	public static void main(String[] args) 
	{
		String s = "Dharmik Narendra Mehta";
		System.out.println(new SwapFirstLastCharOfEachWord().replaceCharPosition(s));

	}
}
