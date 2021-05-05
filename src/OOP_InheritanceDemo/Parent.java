package OOP_InheritanceDemo;

/**
 * @author dharmik mehta
 */
public class Parent {

	public static final int a = 10;
	
	public void m1() {
		System.out.println("I am m1 methods of Parent");
	}
	
	public static void m1(int a) {
		System.out.println("int a value in parent:: "+a);
		System.out.println("I am static m1 int (overload & override) methods of Parent");		
	}
	
	public void m1(float a) {
		System.out.println("float a value in parent:: "+a);
		System.out.println("I am m1 methods float (overload) of Parent");
	}
	
	public void m2() {
		System.out.println("I am m2 method of parent");
	}

/*
	public static void main(String[] args) {

		Parent p = new Child(); // Implicit ~ By feature of Inheritance, Parent class reference can be used to
								// hold child class’s object.

		Child c = (Child) new Parent(); // Explicit ~ Child class reference can be used to hold Parent class’s object.

		Child c1 = new Child(); // Create Child class reference using Child class object

	}
//*/	
}