package OOP_PolymorphismDemo;

/**
 * 
 * @author Dharmik Mehta
 * 
 *         We can overload static and non-static methods.
 * 
 *         Can the return type differ while overloading? Yes.
 */
public class OverloadingNonStaticMethods {

	public void greet() {
		System.out.println("Welcome to Home.");
	}

	private int greet(String name) {
		System.out.println("Welcome to Home " + name);
		return 1;
	}

	public static void main(String[] args) {
		OverloadingNonStaticMethods s1 = new OverloadingNonStaticMethods();
		s1.greet();
		s1.greet("Sweet Home.");
	}
}