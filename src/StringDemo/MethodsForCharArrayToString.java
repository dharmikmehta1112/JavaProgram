package StringDemo;

public class MethodsForCharArrayToString {

	public static void main(String[] args) {
		char c[] = new char[] { 'D', 'h', 'a', 'r', 'm', 'i', 'k', ' ', 'N', '.', ' ', 'M', 'e', 'h', 't', 'a' };

// Option 1 - Using valueOf() method of String class
		String str1 = String.valueOf(c);
		System.out.println("Char to String using Option 1:: " + str1);

// Option 2 - Using constructor of String class
		String str2 = new String(c);
		System.out.println("Char to String using Option 2:: " + str2);
	}
}