// StringBuilder Method

package StringDemo;

public class DemoStringBuilder {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder();
		System.out.println("Empty StringBuilder Constructor:: " + sb1.capacity());
		
		StringBuilder sb2 = new StringBuilder(20);
		System.out.println("StringBuilder Constructor with Integer Capacity:: " + sb2.capacity());
		
		String s = "Hello!!";
		StringBuilder sb3 = new StringBuilder(s);
		System.out.println("Length of String:: " + s.length());
		System.out.println("StringBuilder Constructor with String s:: " + sb3.capacity());

		StringBuilder sb4 = new StringBuilder("Good Morning.");
		System.out.println("Length of String:: " + sb4.length());
		System.out.println("StringBuilder Constructor with String parameter:: " + sb4.capacity());
		
	}
}