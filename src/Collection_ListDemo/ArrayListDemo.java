package Collection_ListDemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Method of List Interface
 * 1. Object get (int index) -- It return the element present at specified index
 * 
 * 2. Object set (int index, object o) -- It set the specified value at specified index and returns if  there is already some
 * 
 * 3. void add(int index, object o) -- It add specified element at specified index and right shift all other after element. 
 * 
 * 4. Object remove (int index) -- It removes and return element from specified index and left shift subsequent elements
 * 
 * 5. List<E> sublist (int fromindex, int toindex) -- It return list of index from fromIndex(including) to toIndex (excluding).
 * 
 * 6. int indexOf (Object o) -- It returns the index of first occurrence of specified element. If element is not present in the list then it will return -1
 * 
 * 7. int lastindexOf( Object o) -- It returns the index of last occurrence of specified element. If element is not present in the list then it will return -1
 * 
 * 8. boolean addAll(int index, collection c) -- It add specified collection elements at specified index and right shift all other after elements.
 * 
 * 9. void replaceAll(opearator) --
 * 
 * 10. sort (comparator) --
 * 
 * 11. listIterator() --
 * 
 * 12. listIterator(int index) --
 */

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList(12);
		al.add(10);
		al.add("Hello");
		al.add(true);
		al.add(3.141f);
		al.add('A');
		al.add(20);
		al.add("Hi");
		al.add('B');
		al.add(6.434f);
		
/*
 * Collection Method
 */
		System.out.println("Arraylist elements: " + al); 		// [10, Hello, true, 3.141, A, 20, Hi, B, 6.434]
		System.out.println("Number of elements in arraylist: " + al.size());	// 9
		System.out.println("Is Empty: " + al.isEmpty());	// false
		System.out.println("Search 'Hi': " + al.contains("Hi"));	// true
		System.out.println("Search 'Hii': " + al.contains("Hii"));	// false
/*
 * 		String s[] = (String[])al.toArray();		// Class Cast Exception ~ Run Time Exception
 * 		System.out.println(s[0]);
 */
		Object o[] = al.toArray();
		System.out.println(String.valueOf(o[6]));
// 		System.out.println(o.toString());
		
		System.out.println(al.add("Hi"));		// true
		System.out.println("Arraylist elements after adding element'Hi': " + al); 		// [10, Hello, true, 3.141, A, 20, Hi, B, 6.434, Hi]	
		
		System.out.println(al.remove("Hi"));		// true
		System.out.println("Arraylist elements after removing element'Hi': " + al);		// remove the first occurence ~ [10, Hello, true, 3.141, A, 20, B, 6.434, Hi]
		
		System.out.println(al.remove("Hii"));		// false
		System.out.println("Arraylist elements after removing element'Hii': " + al);	// remove the first occurence ~ [10, Hello, true, 3.141, A, 20, B, 6.434, Hi]
		
		LinkedList l = new LinkedList();
		l.add("Hi");
		l.add("Hello");
		l.add("How");
		System.out.println("Linkedlist elements: " + l);
		System.out.println("Number of elements in linkedlist: " + l.size());
		
		boolean flag = al.containsAll(l);
		System.out.println(flag);
		System.out.println(al.addAll(l));
		System.out.println("Arraylist after adding element form linkedlist: " + al);
		System.out.println("Number of elements in arraylist: " + al.size());
//		System.out.println(al.removeAll(l));
//		System.out.println("Arraylist after removing element of linkedlist: " + al);
//		System.out.println(al.retainAll(l));
//		System.out.println("Arraylist after retaining element of linkedlist: " + al);
		
		Object q = al.set(2, "Hey");	// return old and set (replace) old with new element
		System.out.println(q);
		System.out.println(al);
		
	}
}