package CLIPractice;

public class DuplicateCharacter {
	
	public static void main(String[] args) {
		String str="helloo";
		char[] ch=str.toCharArray();
		int count=0;
		for(int i=0;i<=ch.length;i++)
		{
			if(ch[i] == ch[i+1])
			{
				count++;
				System.out.println("Duplicate character = "+ch[i]);
				break;
				
			}
			else
			{
				//System.out.print("Non");
			}
			
			
		}
		System.out.println("Duplicate character count = "+count);
		
		
	}
	

}
