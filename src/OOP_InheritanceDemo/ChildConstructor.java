package OOP_InheritanceDemo;

public class ChildConstructor {
	
	public ChildConstructor() {
		System.out.println("No argument constructor of Child");
	}
	
	public ChildConstructor(int i) {
		this();
		System.out.println("Parameterized constructor of Child");
		System.out.println(i+3);
	}
	
	public static void main(String[] args) {

//		ParentConstructor pp = new ParentConstructor(6);
		
//		ParentConstructor pc = new ChildConstructor(6);
		
		ChildConstructor cc = new ChildConstructor(6);
		
//		ChildConstructor cp = new ParentConstructor(6);
		
		
	}

}
