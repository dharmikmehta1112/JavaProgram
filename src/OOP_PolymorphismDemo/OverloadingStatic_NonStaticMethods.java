package OOP_PolymorphismDemo;

/**
 * @author Dharmik Mehta
 * 
 *         We can overload static and non-static methods.
 * 
 *         Can the return type differ while overloading? Yes.
 */

public class OverloadingStatic_NonStaticMethods {
	public static void show(int a) {
		System.out.println("Running method show (int a) " + a);
	}

	public void show(double a) {
		System.out.println("Running method double (double a) " + a);
	}

	public static void main(String[] args) {

		show(20);
		OverloadingStatic_NonStaticMethods s1 = new OverloadingStatic_NonStaticMethods();
		s1.show(100.50);
	}
}