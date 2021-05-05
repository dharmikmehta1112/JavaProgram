package ConstructorDemo;

public class DemoConstructorA {

	private int x = 10, y = 20;

// No Argument Constructor
	DemoConstructorA (){
		System.out.println("Inside No Argument Constructor");
	}
	
// Parameterized Constructor	
	DemoConstructorA (char x){
			this();
			this.x = x;
	}
	
// Parameterized Constructor	
	DemoConstructorA (int x, int y){
		this();
//		this(10);		// CE: Call to this() must be the first statement in constructor.
		this.x = x;
		this.y = y;
//		this();			// CE: Call to this() must be the first statement in constructor.
	}

// Method - name same as class name
	void DemoConstructorA (int xSys, int y){
		this.x = x;
		this.y = y;
	}

	void print() {
		System.out.println(x + " " + y);
	}	
	
	public static void main(String[] args) {
		DemoConstructorA c = new DemoConstructorA();		// Call Constructor of DemoConstructorA
		c.print();
		c.DemoConstructorA(10, 20);							// Call Method of DemoConstructorA
		c.print();		
		}
	
}