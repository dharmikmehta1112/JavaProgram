package CollectionDemo;

import java.util.TreeSet;

/**
 * @author Dharmik Mehta
 * 
 */
public class ObjectDemo {
	public static void main(String[] args) {
		Object x[] = { 10, "Hello", 3.14f }; 	// Object array - hence treat each element as object
												// {new Integer(10), new String("Hello"), new Float(3.14f)}
		
//		int r = x[0] + 5;	// CE - The operator + is undefined for the argument type(s) Object, int

//		Object o = x[0] + 5;	// CE - The operator + is undefined for the argument type(s) Object, int

		int r = (int) x[0] + 5;		// Explicit type cast hence need a collection
		
		System.out.println(r);
		
// Solve problem of explict type casting using collection, check example below
		TreeSet<Integer> ts = new TreeSet();	 // TreeSet generic so now allowed only Integer object
												// w/o generic line 33 will give error

		ts.add(10);	// new Integer(10)
		ts.add(25);
		ts.add(15);
		ts.add(5);
		ts.add(35);
		ts.add(95);
		
		int v = ts.first() + 5;	// hence + operator property is preserved for data element
		
		System.out.println(v);
	}
}