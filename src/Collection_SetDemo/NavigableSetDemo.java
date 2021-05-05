package Collection_SetDemo;

import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * Duplicate not Allowed, Insert Order not Preserved, Heterogeneous Objects not Allowed(ClassCastException).
 * 
 * E lower(E e) --> Returns the greatest element less than the given element or null if there is no such element.
 * first lower of E.
 * 
 * E higher(E e) --> Returns the least element greater than the given element or null if there is no such element.
 * first higher of E.
 * 
 * E floor(E e) --> Returns the greatest less than or equal to the given element or null if there is no such element.
 * first lower of E or equal to E.
 * 
 * E ceiling(E e) --> Returns the least element greater than the given element or null if there is no such element.
 * first higher of E or equal to E.
 * 
 * pollFirst() --> Remove and return the first (lowest) or null if there is no such element.
 * remove and return first E.
 *  
 * pollLast() --> Remove and return the last (highest) or null if there is no such element.
 * remove and return last E.
 * 
 * NavigableSet descendingSet() --> returns a reverse order view of set.
 * 
 * @author Dharmik Mehta
 */
public class NavigableSetDemo {
	public static void main(String[] args) {
	//	NavigableSet ts = new TreeSet();
		TreeSet ts = new TreeSet();
		
		ts.add(7);
		ts.add(10);
		ts.add(9);
		ts.add(12);
		ts.add(13);
		ts.add(18);
		ts.add(20);
		ts.add(15);
		System.out.println("NavigableSet: " + ts);	// [7, 9, 10, 12, 13, 15, 18, 20]
		System.out.println(ts.lower(14));		// 13
		System.out.println(ts.higher(14));		// 15
		System.out.println(ts.floor(14));		// 13
		System.out.println(ts.floor(15));		// 15
		System.out.println(ts.ceiling(14));		// 15
		System.out.println(ts.ceiling(15));		// 15
		System.out.println(ts.pollFirst());		// 7
		System.out.println(ts.pollLast());		// 20
		System.out.println("Updated NavigableSet: " + ts);	// [9, 10, 12, 13, 15, 18]
		System.out.println("Reverse NavigableSet: " + ts.descendingSet());	// [18, 15, 13, 12, 10, 9]
	}
}