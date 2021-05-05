package CollectionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		Collection c;		// Interface
		Collections s;		// Class
		c = new ArrayList();
		Collection x = new ArrayList();
		
		ArrayList al = new ArrayList();
		
		al.iterator();
		
		c.add(10);
		c.add("Hello");
		c.add(true);
		c.add(3.141f);
		c.add('A');
	
		x.add(20);
		x.add("Hi");
		x.add('B');
		x.add(6.434f);
		
		System.out.println(c.size());			// 5
		System.out.println(c.add(20));			// true
		System.out.println(c.size());			// 6
		System.out.println(c.contains(30));		// false
		System.out.println(x.size());			// 4
		System.out.println(x.addAll(c));		// true	
		System.out.println(c.size());			// 6
		System.out.println(c);					// print complete collection
		System.out.println(x.size());			// 10
		System.out.println(x);					// print complete collection
		System.out.println(c.addAll(c));		// true
		System.out.println(c.size());			// 12
		System.out.println(c);					// print complete collection
		System.out.println(x.containsAll(c));	// true
		System.out.println(c.containsAll(x));	// false
		System.out.println(c.isEmpty());		// false
		System.out.println(c.remove('B'));		// false
		System.out.println(x);					// print complete collection
		System.out.println(x.removeAll(c));		// true
		System.out.println(x);					// print complete collection
		System.out.println(c.removeAll(c));		// true
		System.out.println(c.isEmpty());		// true
		System.out.println(c.addAll(x));		// print 
		System.out.println(c);					// print complete collection
		System.out.println(x.add(20));			// true
		System.out.println(x);					// print complete collection
		Object o[] = c.toArray();				// convert to an array of object
		System.out.println(o.length);			// 3
		System.out.println(c);					// print complete collection
		for(int i=0; i<o.length; i++)
		System.out.println(o[i]);				
		
	}
}