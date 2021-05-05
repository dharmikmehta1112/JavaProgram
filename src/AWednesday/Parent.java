package AWednesday;

import java.lang.String; 

	public class Parent {
		
	public Parent() { 		
		System.out.println("No Argument Constructor"); 
	} 	 

	private Parent(int a) { 		
		System.out.println("One Argument Constructor " +a); 	
	} 	 
	
	protected Parent(int b, char c) { 		
		System.out.println("Two Argument Constructor " + b +" "+ c); 
	} 	 
	
	Parent(double d, long e, String f) { 		
		System.out.println("Three Argument Constructor " + d +", "+ e +", "+f); 
	} 	 
	
	public static void main(String args[]) { 		
		Parent n = new Parent(386.12,74263465,"Hasta la Vista"); 
	}
	
}
