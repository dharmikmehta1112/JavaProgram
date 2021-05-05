package OOP_InheritanceDemo;

/**
 * @author Dharmik Mehta
 */

public class Child extends Parent {
	
	public static final int a = 20;
	
	public void m1() {
		System.out.println("I am m1 methods (override) of child");
	}
	
	private void m1Parent() {
		super.m1();
	}
	
	public static void m1(int a) {
		System.out.println("int a value in child:: "+a);
		System.out.println("I am static m1 (override) methods of child");		
	}
	
	public void m3() {
		System.out.println("I am m3 (overload) method of child");
	}
	
	public void m3(float a) {
		System.out.println("float a value in child:: "+a);
		System.out.println("I am m3 (overload) method of child");
	}
	
	public static void main(String[] args) {
		
		Parent.m1(a);
		
// Sub(Child) Class reference and Sub(Child) Object- Allow you to access all the methods and data members of super class and sub class (access override method of sub class only).
//		Child cc = new Child();
//		cc.m1(a);
		
// Super(Parent) Class reference and Sub(Child) Class Object- Allow you to access all the methods and data members of Super class only.
		Parent pc = new Child();
		pc.m1(a);
		
// Super(Parent) Class reference and Super(Parent) Class Object - Allow you to access all methods and data members of super class only.
//		Parent pp = new Parent();
//		pp.m1(a);
		
// Sub(Child) Class reference and Super(Parent) Class object- child cannot hold parent object
//		Child cp = new Parent();
		
//		Child cpc = (Child) new Parent();		// ClassCastException
		

	}
}
