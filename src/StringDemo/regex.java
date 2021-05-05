package StringDemo;

public class regex {
	
	public static boolean isAlpha(String s)
	{
		s.split("^[,.?:!@#$%^&*()]*$");
//		return s != null && s.matches("^[a-zA-Z ]*$");	// lowercase, uppercase, blank space
		return s != null && s.matches("^[0-9]*$");		// digit
		
	}
	
	public static void main(String[] args)
	{
	   String s = "cats AND*Dogs-are Awesome";
	   // System.out.println("IsAlpha: " + isAlpha(s));
	   //System.out.println(s.split("^[*-]*$"));
	   System.out.println(s.replaceAll("^[*-]*$", ""));
	}
}
