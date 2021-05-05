package VariablesDemo;

/**
 * @author Dharmik Mehta
 *         -- Local variables will be given preference over Global Variables
 *         -- Priority is given to local variable initialization.
 *         -- Local variable only default and final is allowed.
 */
public class A {
	static int i = 10;
// Instance Block
	{
		// i = 20;
		System.out.println("Inside Instance Block: " + i);
	}
// Static Block
	static {
		// i = 30;
		System.out.println("Inside Static Block: " + i);
	}
// Constructor
	public A() {
		// i = 20;
		System.out.println("Inside Constructor: " + i);
	}

	public static void main(String[] args) {
		Object o;
		A a = new A();
		A b = new A();
	}
}