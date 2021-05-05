package OOP_PolymorphismDemo;

/**
 * @author Dharmik Mehta
 * 
 * Duplicate method test(int) in type MethodOverloading
 */
public class DuplicateMethodsDemo {
	public static void test(int a) {
		System.out.println("Running Test (int a)");
	}

	private void test(int b) {
		System.out.println("Running Test (int b)");
	}

	public static void main(String[] args) {
		test(20);
	}
}