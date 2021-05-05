package AWednesday;

public class Child extends Parent{
	
	protected Child() {
		super(54, 'G'); 		
		System.out.println("Child Constructor");
	 } 	 
	
	public static void main(String args[]) { 		
		Child m = new Child(); 	
	}


}
