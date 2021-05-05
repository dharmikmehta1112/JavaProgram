package OOP_InheritanceDemo;

public class TestC {

	String name;
	
	static void staticMethod() {
		System.out.println();
	}
	
	static void staticMethod(String t) {
		name = t;
	}
	
	public static void main(String[] args) {
		
		TestC cpp = new TestC();
		TestC java = new TestC("JAVA");
		
		cpp.setName("CPP");
		
		java.getName();
		cpp.getName();
		
		setName(String t){
			name = t;
		}
		
		getName(){
			System.out.println("Name:: " + name);
		}
		
	}
	

}
