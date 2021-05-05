package CLIPractice;


public class CompareString {
	
	public static void main(String[] args) {
		String s="Sonali";
		String s1="Sonali";
		
		System.out.println(s.equals(s1));//direct method
		
		//Indirect conditional Statement
		if(s == s1)
		{
			System.out.println("Same String");
		}
		else
		{
			System.out.println("string not same");
		}
	}

}
