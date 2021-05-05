package ExceptionDemo;

import java.io.IOException;

/**
 * @author Dharmik Mehta
 */
public class DivideByZeroException {

	public static void main(String[] args) throws IOException {
			try{
				int a = 15;
				int b = 0;
				int res = a/b;
			} catch (ArithmeticException e) {
				System.err.println("Catch 2");
				System.exit(0);
			} finally {
				System.out.println("Finally");
			}
	}
}