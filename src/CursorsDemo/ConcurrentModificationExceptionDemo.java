package CursorsDemo;

import java.util.TreeSet;

/**
 * ConcurrentModificationException(RE): This exception may be thrown by methods
 * that have detected concurrent modification of an object when such
 * modification is not permissible. It is not generally permissible for one
 * thread to modify a Collection while another thread is iterating over it. In
 * general, the results of the iteration are undefined under these
 * circumstances. Some Iterator implementations may choose to throw this
 * exception if this behavior is detected. Iterators that do this are known as
 * iterators, as they fail quickly and cleanly, rather that risking arbitrary,
 * non-deterministic behavior at an undetermined time in the future.
 * 
 * @author Dharmik Mehta
 */
public class ConcurrentModificationExceptionDemo {
	public static void main(String[] args) {

		TreeSet<Integer> ts = new TreeSet();
		ts.add(4);
		ts.add(5);
		ts.add(6);
		ts.add(7);
		ts.add(8);
		ts.add(9);

		System.out.print("TreeSet (using 'for-each'): ");

// When iteration in process, no modification is allowed for object hence throw RTE as ConcurrentModificationException
		for (Object object : ts) {
			System.out.print(object + " "); // Reading
//			ts.add(15);
//			ts.add(ts.first() + 10); // Insertion + Reading (ts.first)
			ts.remove(8); // Deletion/Removal
		}
	}
}