package CLIPracticesM;
final class A {
	protected int a = 10;
}

final class B extends A {		//  error: cannot inherit from final A
	public void print() {
		System.out.println(a);
	}
}