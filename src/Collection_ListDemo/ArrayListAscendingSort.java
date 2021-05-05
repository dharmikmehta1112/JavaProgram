package Collection_ListDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * public static void sort (list)
 * 
 * public static void sort (list, Comparator c)
 * 
 * For heterogeneous object values Collections.sort(al) will give ClassCastException. Hence need to used Comparable or Comparator.
 * 
 * @author Dharmik Mehta
 */
public class ArrayListAscendingSort {
	public static void main(String[] args) {
		
		List al = new ArrayList();
	
		al.add(100);
		al.add(20);
		al.add(50);
		al.add(80);
		al.add(120);
/*
		al.add("Hello");
		al.add(true);
		al.add(3.141f);
		al.add('A');
		al.add(20);
		al.add("Hi");
		al.add('B');
		al.add(6.434f);
*/		
		System.out.println("ArrayList: " + al);
		
		Collections.sort(al);					// for comparable
		Collections.sort(al, new comparator());		// for comparator
		
		System.out.println("ArrayList after sort: " + al);
	}
}