package CursorsDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

/**
 * Some of the collections have data types for which we cannot use ‘for-loop’ to
 * iterate like HashSet, LinkedHashSet, TreeSet (alternate to use 'for-each')
 * etc. For these kind of collection Java has introduced Cursors.
 * 
 * Object get(int index) only in List(I)
 * 
 * ConcurrentModificationException
 * 
 * @author Dharmik Mehta
 */
public class NeedOfCursors {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		LinkedList ll = new LinkedList();
		Vector v = new Vector();
		Stack s = new Stack();
		HashSet hs = new HashSet();
		LinkedHashSet lhs = new LinkedHashSet();
		TreeSet ts = new TreeSet();
		
		String s;
		StringBuffer sb;
		StringBuilder sb1;

		al.add("Hi");
		al.add(10);
		al.add(true);
		al.add('A');
		al.add(3.141f);
		al.add("Hello");
		System.out.print("ArrayList: (using 'for-loop'): ");
		for (int i = 0; i < al.size(); i++) {
			System.out.print(al.get(i)); // print hashcode
			if (i < al.size() - 1)
				System.out.print(", ");
		}

		ll.add("Hi");
		ll.add(10);
		ll.add(true);
		ll.add('A');
		ll.add(3.141f);
		ll.add("Hello");
		System.out.print("\nLinkedList (using 'for-loop'): ");
		for (int i = 0; i < ll.size(); i++) {
			System.out.print(ll.get(i));
			if (i < ll.size() - 1)
				System.out.print(", ");
		}

		v.add("Hi");
		v.add(10);
		v.add(true);
		v.add('A');
		v.add(3.141f);
		v.add("Hello");
		System.out.print("\nVector  (using 'for-loop'): ");
		for (int i = 0; i < v.size(); i++) {
			System.out.print(v.get(i)); // print hashcode
			if (i < v.size() - 1)
				System.out.print(", ");
		}

		s.add("Hi");
		s.add(10);
		s.add(true);
		s.add('A');
		s.add(3.141f);
		s.add("Hello");
		System.out.print("\nStack (using 'for-loop'): ");
		for (int i = 0; i < s.size(); i++) {
			System.out.print(s.get(i)); // print hashcode
			if (i < s.size() - 1)
				System.out.print(", ");
		}

		hs.add(4);
		hs.add(5);
		hs.add(6);
		hs.add(7);
		hs.add(8);
		hs.add(9);
		System.out.print("\nHashSet (using 'for-each'): ");
		for (Object object : hs) {
			System.out.print(object + " ");
		}

		lhs.add(4);
		lhs.add(5);
		lhs.add(6);
		lhs.add(7);
		lhs.add(8);
		lhs.add(9);
		System.out.print("\nLinkedHashSet (using 'for-each'): ");
		for (Object object : hs) {
			System.out.print(object + " ");
		}

		ts.add(4);
		ts.add(5);
		ts.add(6);
		ts.add(7);
		ts.add(8);
		ts.add(9);
		System.out.print("\nTreeSet (using 'for-each'): ");
		for (Object object : ts) {
			System.out.print(object + " ");
		}

		ts.add(4);
		ts.add(5);
		ts.add(6);
		ts.add(7);
		ts.add(8);
		ts.add(9);
		System.out.print("\nTreeSet (using 'for-loop'): ");
		for (int i = 0; i < ts.size(); i++) {
			System.out.print(ts.pollFirst());
			if (i < ts.size() - 1)
				System.out.print(", ");
		}
	}
}