package OuterInnerClassDemo;

/**
 * Inner class and inner interface are used for tight encapsulation.
 * 
 * @author Dharmik Mehta
 */
public class Outer {
	int i = 20;

// Inner Class	
	class Inner {
		int i = 10;

		public void display() {
			System.out.println("Value: " + i);
		}
	}

	public static void main(String[] args) {
		Outer o = new Outer();
		Inner i = o.new Inner(); // Inner class object creation by use of outer class reference
		i.display();
	}
}