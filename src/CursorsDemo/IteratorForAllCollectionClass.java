package CursorsDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

/**
 * iterator():
 * iterates in forward direction only
 * use for all collection classes
 * always start from first index & end at last index (in btw start and end not possible)
 * it can avoid ConcurrentMethodModificationException
 * methods are not synchronized (hence not thread safe)
 * we can remove element using iterator methods
 * 
 * methods of iterator:
 * 
 * 1) boolean hasNext(): returns true if the iteration has more elements.
 * 
 * 2) E next(): returns the next element in the iteration.
 * 
 * 3) default void remove(): removes the last element returned by iterator.
 *                           This method can be called only once per call to next().
 *                           Multiple call may give IllegalModifierException
 * 
 * remove() method is available in both Collection(I) and Iterator(I). But it is advice
 * to use remove() method of iterator while handling collection for iteration.
 * 
 * @author Dharmik Mehta
 */
public class IteratorForAllCollectionClass {
	public static void main(String[] args) {

//		ArrayList ts = new ArrayList();
//		LinkedList ts = new LinkedList();
//		Vector ts = new Vector();
//		Stack ts = new Stack();
//		HashSet ts = new HashSet();
		LinkedHashSet ts = new LinkedHashSet();
//		TreeSet ts = new TreeSet();
		ts.add(4);
		ts.add(5);
		ts.add(6);
		ts.add(7);
		ts.add(8);
		ts.add(9);
				
// Iterator for all collection - forward direction only
		Iterator itr = ts.iterator();		// Interface object cannot be created hence we used method
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
	}
}