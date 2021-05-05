package CLIPractice;

public class Replacesplcharacter {
	public static void main(String[] args) {
		String s="te$ting $h@str@";
		/*char ch[]=s.toCharArray();
		int i;
		for(i=0;i<ch.length;i++)
		{
			if(ch[i] == '@' || ch[i] == '$')
			{
				ch[i]='x';
			}
			else
			{
				//System.out.println("special character is not present");
			}
		}
		System.out.println(ch);*/
		s=s.replaceAll("[$+@]", "X");
		System.out.println(s);
	}

}
