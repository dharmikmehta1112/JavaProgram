package CursorsDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * public interface ListIterator extends Iterator
 * 
 * listIterator():
 * iterates in forward and reverse direction
 * use for collection classes whose data structure is list or doubly linked 
 * always start from first index & end at last index or vice versa (in btw start and end not possible)
 * it can avoid ConcurrentMethodModificationException
 * methods are not synchronized (hence not thread safe)
 * we can remove element using iterator methods
 * 
 * methods of iterator:
 * 
 * 1) boolean hasNext(): returns true if the iteration has more elements in traversing in forward direction.
 * 
 * 2) E next(): returns the next element in the iteration and advances the cursor position forward.
 * 
 * 3) void remove(): removes the last element that was returned by next() or previous(). 
 *                   This method can be called only once per call to next() or previous().
 *                   This method can be made only if add() has not been called after the last call to next() or previous().
 * 
 * 4) boolean hasPrevious(): returns true if the iteration has more elements in traversing in reverse direction.
 * 
 * 5) E previous(): returns the previous element in the iteration and moves the cursor position backwards.
 * 
 * 6) int nextIndex(): returns the index of the element after a call to next.
 * 
 * 7) int previousIndex(): returns the index of the element after a call to previous.
 * 
 * 8) void add(E e): inserts the specified element immediately before returned by next() and after returned by previous().
 * 
 * 9) void set(E e): replaces the last element returned by next() or previous() with the specified element.
 * 					 This call can be made only if neither remove() nor add() have been called after the 
 *                   last call to next() or previous().
 * 
 * remove(), add(), set() methods is available in both Collection(I) and Iterator(I). But it is advice
 * to use methods of iterator while handling collection for iteration.
 * 
 * @author Dharmik Mehta
 */
public class ListIteratorForListDoublyLinkedCollectionClass {
	public static void main(String[] args) {

		ArrayList al = new ArrayList();
//		LinkedList al = new LinkedList();
	
		al.add("Hi");
		al.add(5);
		al.add(6.434f);
		al.add(true);
		al.add("Hello");
		al.add(9);
		al.add('D');
/*
// ListIterator for collection of list or doubly linked - forward direction only
		ListIterator itr = al.listIterator();		// Interface object cannot be created hence we used method
		System.out.print("Forward Direction: ");
		while (itr.hasNext()) {
			System.out.print(itr.next() + ", ");
		}
// ListIterator for collection of list or doubly linked - reverse direction only
		ListIterator itr1 = al.listIterator();		// Interface object cannot be created hence we used method
		System.out.print("\nReverse Direction: ");
//		itr1.previous();			// RTE: NoSuchElememtException
// Hence we used while loop to move cursor to end index
		while (itr1.hasNext()) {
			itr1.next();
		}
		while (itr1.hasPrevious()) {
			System.out.print(itr1.previous() + ", ");
		}
*/		
		ListIterator itr = al.listIterator();
		while(itr.hasNext()) {
			itr.next();
			itr.set(50);
//			itr.remove();
//			itr.add(20);
		}
		System.out.println(al);
	}
}