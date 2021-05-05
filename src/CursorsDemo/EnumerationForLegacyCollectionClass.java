package CursorsDemo;

import java.util.Enumeration;
import java.util.Stack;
import java.util.Vector;

/**
 * enumeration():
 * iterates in forward direction only
 * use only for legacy collection classes e.g. vector and stack
 * always start from first index & end at last index (in btw start and end not possible)
 * it can avoid ConcurrentMethodModificationException
 * methods are not synchronized (hence not thread safe)
 * 
 * methods of enumeration:
 * 
 * 1) boolean hasMoreElements(): return true if and only if enumeration object contains at 
 *                               least one more element to provide, false otherwise.
 * 
 * 2) E nextElement(): return the next element of enumeration.
 * 
 * @author Dharmik Mehta
 */
public class EnumerationForLegacyCollectionClass {
	public static void main(String[] args) {

//		Vector v = new Vector();
		Stack v = new Stack();

		v.add("Hi");
		v.add(true);
		v.add(45);
		v.add("Hello");
		v.add('D');
		v.add(3.1414f);
// Enumeration only for legacy collection classes - forward direction only
		Enumeration e = v.elements();
		while (e.hasMoreElements()) {
			System.out.print(e.nextElement() + ", ");
		}
	}
}