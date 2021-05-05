package VariablesDemo;

/**
 * @author dharmik mehta -- Execution ==> static block, methods and variables
 *         --> instance block (only when object is form) --> constructor (only
 *         when object is form) -- Blank local and final variables are allowed.
 *         -- Local and final variables can be declare without initialization
 *         but cannot use it (error). Need to compulsorily initialize before
 *         use. -- For initializing instance final variable use instance
 *         block/constructor. -- For initializing static final variable use only
 *         static block. -- With local variable only default and final modifiers
 *         are allowed. -- Instance variables are call using object. -- Static
 *         variables are call using class name/object. In same class we can call
 *         them directly.
 */

public class TestVariables {
// static variable
	static int k;

// instance variable
	int i;

// Instance Block
	{
//		i = 10;
		System.out.println("Inside instance block value of instance variable: " + i);
		System.out.println("Inside instance block value of static variable: " + k);
	}

	static {
//		k = 10;
		System.out.println("Inside static block value of static variable: " + k);
	}

// public Constructor
	public TestVariables() {
//		i = 20;
		System.out.println("Inside public Constructor value of instance variable: " + i);
		System.out.println("Inside public Constructor value of static variable: " + k);
	}

// public method	
	public void TestVariables() {
		int j = 30;
//		i = 30;
//		k = 30;
		int k = 50;
		System.out.println("Inside public method value of instance variable: " + i);
		System.out.println("Inside public method value of local variable: " + j);
		System.out.println("Inside public method value of static variable: " + TestVariables.k); // 30
		System.out.println("Inside public method value of local variable name same as static variable: " + k); // 50
	}

	public static void main(String[] args) {
		TestVariables t1 = new TestVariables();
		t1.TestVariables();
		TestVariables t2 = new TestVariables();
		int i = 40;
//		k = 30;
		int k = 50;
		System.out.println("Inside main method value of instance variable: " + t1.i);
		System.out.println("Inside main method value of instance variable: " + t2.i);
		System.out.println("Inside main method value of local variable: " + i);
		System.out.println("Inside main method value of local variable name same as static variable: " + k);
		System.out.println("Inside main method value of static variable: " + TestVariables.k);
	}
}