package StringDemo;

public class MethodsForStringToCharArray {

	public static void main(String[] args) {
		String str = "Dharmik N. Mehta";

		char c[] = str.toCharArray();
// Using for each method
//	for(char ch : c)
//		System.out.println(ch);

// Using for method
		for (int i = 0; i < c.length; i++)
			// System.out.println(str.charAt(i));
			System.out.println(c[i]);
	}
}