package Collection_SetDemo;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * SortedSet subSet(E fromElement, E toElement) --> return a view of the portion of set whose elements range 
 * 													from fromElement (inclusive) to toElement (exclusive).
 * 
 * SortedSet headSet(E toElement) --> return a view of the portion of set whose elements are strictly less 
 * 									  than toElement (exclusive)
 *       
 * SortedSet tailSet(E fromElement) --> return a view of the portion of set whose elements are strictly greater
 *       					    	    than fromElement (inclusive)
 *       
 * E first() --> returns the first (lowest) element currently in set.
 * 
 * E last() --> returns the last (highest) element currently in set.
 *       
 * @author Dharmik Mehta
 */
public class SortedSetDemo {
	public static void main(String[] args) {
		// SortedSet ts = new TreeSet();
		TreeSet ts = new TreeSet();
		ts.add(7);
		ts.add(10);
		ts.add(9);
		ts.add(12);
		ts.add(13);
		ts.add(18);
		ts.add(20);
		ts.add(15);
		System.out.println("SortedSet: " + ts); // [7, 9, 10, 12, 13, 15, 18, 20]
		System.out.println(ts.subSet(10, 18));	// 10 is inclusive & 18 is exclusive
		System.out.println(ts.headSet(18));		// [7, 9, 10, 12, 13, 15]
		System.out.println(ts.tailSet(10));		// [10, 12, 13, 15, 18, 20]
		System.out.println(ts.first());			// 7
		System.out.println(ts.last());			// 20
		System.out.println("Updated SortedSet:" +ts);
	}
}