// StringBuffer Method

package StringDemo;

public class DemoStringBuffer {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		System.out.println("Empty StringBuffer Constructor:: " + sb1.capacity());
		System.out.println("Empty StringBuffer Constructor using length:: " + sb1.length());

		StringBuffer sb2 = new StringBuffer(20);
		System.out.println("StringBuffer Constructor with Integer Capacity:: " + sb2.capacity());
		System.out.println("StringBuffer Constructor with Integer Capacity using length:: " + sb2.length());
		
		String s = "Hello!!";
		StringBuffer sb3 = new StringBuffer(s);
		System.out.println("Length of String:: " + s.length());
		System.out.println("StringBuffer Constructor with String s:: " + sb3.capacity());
		System.out.println("StringBuffer Constructor with String s using length:: " + sb3.length());
		
		StringBuffer sb4 = new StringBuffer("Good Morning.");
		System.out.println("Length of String:: " + sb4.length());
		System.out.println("StringBuffer Constructor with String parameter:: " + sb4.capacity());
		System.out.println("StringBuffer Constructor with String parameter using length:: " + sb4.length());

		// System.out.println("StringBuffer after delete char at 4:: " +
		// sb3.deleteCharAt(4));
		System.out.println("StringBuffer after reverse:: " + sb3.reverse());

	}
}