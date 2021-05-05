package Collection_SetDemo;

import java.util.TreeSet;

/**
 * StringBuffer class not implements Comparable(I) hence StringBuffer class
 * objects are not able to compare themselves. Hence it cannot run method
 * compareTo() internally.
 * 
 * Hence need a Compartor.
 * 
 * @author Dharmik Mehta
 */
public class TreeSetStringBufferComparator {
	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet(new StringBufferComparator());

		StringBuffer sb1 = new StringBuffer("Hello");
		StringBuffer sb2 = new StringBuffer("Hi");
		StringBuffer sb3 = new StringBuffer("Good");
		StringBuffer sb4 = new StringBuffer("Morning");

		ts.add(sb2);
		ts.add(sb1);	// sb2.compareTo(sb1)
		ts.add(sb4);	// sb2.compareTo(sb4) &
		ts.add(sb3);	// sb2.compareTo(sb3) &

		System.out.println(ts);
	}
}