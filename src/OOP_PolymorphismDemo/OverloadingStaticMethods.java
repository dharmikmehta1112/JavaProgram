package OOP_PolymorphismDemo;

/**
 * @author Dharmik Mehta
 * 
 *         We can overload static and non-static methods.
 * 
 *         Can the return type differ while overloading? Yes.
 */

public class OverloadingStaticMethods {
//	public static final double PI = 3.14141;

	public static void area(int side) {
		int area = side * side;
		System.out.println("Area of Square: " + area);
	}

	public static void area(int length, int breadth) {
		int area = length * breadth;
		System.out.println("Area of Rectangle: " + area);
	}

	public static void area(double radius) {
		final double PI = 3.14141;
		double area = PI * radius * radius;
		System.out.println("Area of Circle: " + area);
	}

	public static void main(String[] args) {
		area(5);
		area(10, 20);
		area(15);
		area(25.5);
	}
}