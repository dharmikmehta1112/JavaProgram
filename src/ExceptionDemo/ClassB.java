package ExceptionDemo;

public class ClassB {

	public void m2() {
		ClassC c = new ClassC();
		c.m3();
		System.out.println("In class B");
	}
}