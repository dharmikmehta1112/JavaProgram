package SingletonDesign;

public class MyClass {
	
	private static MyClass my = new MyClass();
	
	public static MyClass getInstance() {
		return my;
	}
	
	private MyClass() {
		
	}

}
