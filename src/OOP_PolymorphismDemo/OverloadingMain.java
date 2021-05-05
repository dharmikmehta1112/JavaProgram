package OOP_PolymorphismDemo;

/**
 * @author Dharmik Mehta
 * 
 *         Yes, we can overload main but the program execution starts with main
 *         method having arguments as (String[] args). Other versions of the
 *         main program should be invoked by the programmer explicitly.
 */
public class OverloadingMain {

	public static void main(int a) {
		System.out.println("Running Main(int a)");
	}

	public static void main(double a) {
		System.out.println("Running Main(double a)");

	}
	
	public static void main (char... a) {
		System.out.println("Running main(a)");
	}

	public abstract void main(String args[]) {
		main(10);
		main(100.5);
	}

	public static void main(String... args) {
		main(10);
		main(100.5);
	}
}