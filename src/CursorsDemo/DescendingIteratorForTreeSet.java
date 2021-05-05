package CursorsDemo;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * public Iterator descendingIterator(): returns an iterator over the elements
 * of set in descending order.
 * 
 * @author Dharmik Mehta
 */
public class DescendingIteratorForTreeSet {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(10);
		ts.add(15);
		ts.add(8);
		ts.add(5);
		ts.add(25);
		ts.add(30);
		ts.add(20);

		System.out.println("Treeset:: " + ts);

		Iterator itr = ts.descendingIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}