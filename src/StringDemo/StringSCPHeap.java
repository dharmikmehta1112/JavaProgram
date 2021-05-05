// Program to understand string in SCP and Heap. 

package StringDemo;
/**
 * == is used to check address/reference of object.
 * equals() method is used to check hashcodes of object. (match content)
 * In SCP duplicates are not allowed.
 * 
 * @author Dharmik Mehta
 */
public class StringSCPHeap {

	public static void main(String[] args) {

		String s = "Hello"; // SCP
		String t = "Hello"; // SCP and reference t will point at same memory as s
		String p = new String("Hello"); // Create 2 objects. 1 in SCP other in Heap. But always point to value in
										// Heap memory. Whereas SCP value will not be referred.
		p.concat("Hi");
		System.out.println(p);
//		if(t==p)
//			System.out.println("References are same.");
//		else
//			System.out.println("References are different.");

		if (s == t)
			System.out.println("s==t");		//	In SCP same address as value is same
		else
			System.out.println("s!=t");

		if (s.equals(t))				
			System.out.println("s equals t");		// In SCP same hashcode as value is same
		else
			System.out.println("s not equals t");

		if (s == p)
			System.out.println("s==p");
		else
			System.out.println("s!=p");		// s in SCP and p in Heap and copy in SCP but p pointing to Heap,
											// different address
		if (s.equals(p))				
			System.out.println("s equals p");		// s in SCP and p in Heap and copy in SCP but p pointing to Heap,
											// same hashcode as value is same
		else
			System.out.println("s not equals p");

//		String s = new String("Hello");		// Heap
//		String t = new String("Hello");		// Heap
//		if(s==t)
//			System.out.println("References are same.");
//		else
//			System.out.println("References are different.");

//		String s = "Hello!!";		// SCP
//		String t = s.concat(" I am fine.");		// SCP
//		System.out.println(t);
//		String p = "Hello!! I am fine.";	// SCP*
//		System.out.println(p);
//		String q = new String("Hello!! I am fine.");	
//		if(t==p)
//			System.out.println("References are same.");
//		else
//			System.out.println("References are different.");

//		char c[] = {'H','e','l','l','o'};	// character array
//		String s = new String(c);			// string ~ sequence of character
//		System.out.println(s);
//		String t = new String(c,1,4);		// string, start index, count
//		System.out.println(t);
	}
}