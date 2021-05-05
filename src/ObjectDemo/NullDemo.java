package ObjectDemo;

/**
 * @author Dharmik Mehta
 */

public class NullDemo {	

	public static void NullDemo (Object o) {
		System.out.println("Object");
	}

	public static void NullDemo (String str) {
		System.out.println("String");
	}
/*
	public static void NullDemo (Integer i) {
		System.out.println("Integer");
	}

	public static void NullDemo (Float i) {
		System.out.println("Float");
	}
*/

	public static void main(String[] args) {		
		NullDemo(null);
	}
}