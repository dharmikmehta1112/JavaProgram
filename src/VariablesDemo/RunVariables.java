package VariablesDemo;

/**
 * @author dharmik mehta
 *
 */

public class RunVariables {

	int i;

	public void m1() {
		i = 10;
		System.out.println("Value of i: " + i);
	}

	public static void main(String[] args) {

		RunVariables rv = new RunVariables();
		RunVariables rv2 = new RunVariables();
	}
}