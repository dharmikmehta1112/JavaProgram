package OOP_InheritanceDemo;

public class ParentConstructor {
	
	public ParentConstructor() {
		System.out.println("No argument constructor of Parent");
	}
	
	public ParentConstructor(int i) {
		this();
		System.out.println("Parameterized constructor of Parent");
		System.out.println(i);
	}
	
}
