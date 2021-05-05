package StringDemo;

/**
 * public boolean contains(CharSequence s): returns true if and only if the string contains
 *                                          the specified sequence of char values.
 * 
 * public boolean matches(String regex): returns true if and only if the string matches the 
 *                                       given regular expression.
 * 
 * @author Lenovo
 */
public class MethodContainsMatchesDemo {
	public static void main(String[] args) {
		
		String s = new String("Mahesh");
		CharSequence ch = "Mahesh";
//		boolean value = s.contains("[A-Za-z]");
		boolean value = s.contains(ch);
		System.out.println(value);
		
		String s1 = "Mahesh";
		boolean value1 = s.matches("^[A-Za-z]*$");
//		boolean value1 = s.matches(s1);
		System.out.println(value1);
	}
}