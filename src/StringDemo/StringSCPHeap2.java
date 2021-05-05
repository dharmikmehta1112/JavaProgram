package StringDemo;

import java.nio.charset.Charset;

// If you want to store the string in the constant pool then you will need to use “intern” with it.
// It is preferred to use String literals as it allows JVM to optimize memory allocation.

public class StringSCPHeap2 {
	
	public static void main(String[] args) {
					
		String d = "Dharmik";
		String d1 = new String("Dharmik");
		String c = d1.intern();			// m moves to SCP
		
		String m1 = new String("Mehta");
		String c1 = m1.intern();
		
		System.out.println(d==d1);			// False
		
		System.out.println(d.equals(d1));	// True
		
		System.out.println(d==c);			// True
		
		System.out.println(d.equals(c));	// True
		
		System.out.println(d1==c);			// False
		
		System.out.println(d1.equals(c));	// True
		
		d.concat("Mehta");
		System.out.println(d);
		
		d1.concat("Mehta");
		System.out.println(d1);
		
		c.concat("Mehta");
		System.out.println(c);
		
		
		
	}

}
