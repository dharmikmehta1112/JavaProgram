/**
 * 
 */
package ExceptionDemo;

public class ClassA {
	
	public void m1() {
		ClassB b = new ClassB();
		b.m2();
		System.out.println("In class A");
	}
	
	public static void main(String[] args) {
		ClassA a = new ClassA();
		a.m1();
	}
}